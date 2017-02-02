package com.infoplatform.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infoplatform.common.SystemConstant;
import com.infoplatform.common.dao.CommentDOMapper;
import com.infoplatform.common.util.LoggerUtil;
import com.infoplatform.core.model.News;
import com.infoplatform.core.model.NewsType;
import com.infoplatform.core.model.SNSUserInfo;
import com.infoplatform.core.model.WeixinOauth2Token;
import com.infoplatform.core.service.NewsCache;
import com.infoplatform.core.service.PermissionUtil;
import com.infoplatform.core.service.SignatureUtil;
import com.infoplatform.core.service.UserService;

@Controller
public class NewsController {
    /** logger */
    private static Logger   logger = Logger.getLogger(NewsController.class);
    @Resource
    private UserService     userService;

    @Resource
    private CommentDOMapper commentDOMapper;

    @RequestMapping(value = "/getUser.htm", method = RequestMethod.GET)
    public String getUser(HttpServletRequest request, HttpServletResponse response, Model model) {
        return "showUser";
    }

    @RequestMapping(value = "/getNews.htm", method = RequestMethod.GET)
    public String getNews(HttpServletRequest request, HttpServletResponse response, Model model) {
        return getContent(request, response, model, NewsType.News.getCode());
    }

    @RequestMapping(value = "/getTopic.htm", method = RequestMethod.GET)
    public String getTopic(HttpServletRequest request, HttpServletResponse response, Model model) {
        return getContent(request, response, model, NewsType.TOPIC.getCode());
    }

    /** 
     * 根据不同类型获取相应资讯
     * 
     * @param request
     * @param response
     * @param model
     * @param type
     * @return
     */
    private String getContent(HttpServletRequest request, HttpServletResponse response, Model model,
                              String type) {
        initialUserInfo(request, response, model);
        List<News> newsList = new ArrayList<News>();
        if (StringUtils.equals(type, NewsType.News.getCode())) {
            newsList = NewsCache.getNewsList();
        } else {
            newsList = NewsCache.getTopicList();
        }
        int pieces = Integer.parseInt(request.getParameter("pieces"));
        for (int i = 1; i <= pieces && i < newsList.size(); i++) {
            model.addAttribute("news" + i, newsList.get(i - 1));
        }
        //        initialSignature(model);
        model.addAttribute("appId", SystemConstant.appid);
        return "showNews" + pieces;
    }

    /**
     * 获取网页签名，用于获取微信公众号
     * 
     * @param model
     */
    private void initialSignature(Model model) {
        model.addAttribute("timestamp", SignatureUtil.getTimestamp());
        model.addAttribute("signature1", SignatureUtil.getSignature1());
        model.addAttribute("signature2", SignatureUtil.getSignature2());
    }

    /**
     * 获取用户授权信息并渲染进网页
     * 
     * @param request
     * @param response
     * @return
     */
    private SNSUserInfo initialUserInfo(HttpServletRequest request, HttpServletResponse response,
                                        Model model) {
        SNSUserInfo snsUserInfo = new SNSUserInfo();
        int userId = 1;
        try {
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");

            // 用户同意授权后，能获取到code
            String code = request.getParameter("code");
            String state = request.getParameter("state");

            LoggerUtil.info(logger, "code is:", code);

            // 用户同意授权
            if (code != null && !StringUtils.equals("authdeny", code)) {
                // 获取网页授权access_token
                WeixinOauth2Token weixinOauth2Token = PermissionUtil
                    .getOauth2AccessToken(SystemConstant.appid, SystemConstant.appSecret, code);
                // 网页授权接口访问凭证
                if (weixinOauth2Token != null) {
                    LoggerUtil.info(logger, "get auth token:", weixinOauth2Token);
                    String accessToken = weixinOauth2Token.getAccessToken();
                    // 用户标识
                    String openId = weixinOauth2Token.getOpenId();
                    // 获取用户信息
                    snsUserInfo = PermissionUtil.getSNSUserInfo(accessToken, openId);
                    LoggerUtil.info(logger, "get sns user info:", snsUserInfo);
                    userId = userService.insertUserInfo(snsUserInfo);

                    // 设置要传递的参数
                    request.setAttribute("snsUserInfo", snsUserInfo);
                    request.setAttribute("state", state);
                }
            }
        } catch (Exception e) {
            LoggerUtil.error(logger, "get user info exception", e);
        }

        if (StringUtils.isNotEmpty(snsUserInfo.getNickname())) {
            model.addAttribute("username", snsUserInfo.getNickname());
        } else {
            model.addAttribute("username", "visitor");
        }
        if (StringUtils.isNotEmpty(snsUserInfo.getHeadImgUrl())) {
            model.addAttribute("userImage", snsUserInfo.getHeadImgUrl());
        } else {
            model.addAttribute("userImage", "images/userPic.png");
        }
        model.addAttribute("userId", userId);
        return snsUserInfo;
    }

}
