/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infoplatform.common.util.LoggerUtil;
import com.infoplatform.core.model.SNSUserInfo;
import com.infoplatform.core.model.WeixinOauth2Token;
import com.infoplatform.core.service.PermissionUtil;

/**
 * 
 * @author MaxKun
 * @version $Id: WeixinController.java, v 0.1 2016年5月31日 下午5:11:44 MaxKun Exp $
 */
@Controller
public class WeixinController {

    private static Logger logger = Logger.getLogger(WeixinController.class);

    @RequestMapping(value = "/getUserInfo.htm", method = RequestMethod.GET)
    public void getUserInfo(HttpServletRequest request, HttpServletResponse response, Model model) {
        try {
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");

            // 用户同意授权后，能获取到code
            String code = request.getParameter("code");
            String state = request.getParameter("state");

            LoggerUtil.info(logger, "code is:", code);

            // 用户同意授权
            if (!"authdeny".equals(code)) {
                // 获取网页授权access_token
                WeixinOauth2Token weixinOauth2Token = PermissionUtil.getOauth2AccessToken(
                    "wxee58cbd0c4edeeda", "d35a37d986636cea2f3fb0c2f961f43c", code);
                LoggerUtil.info(logger, "get auth token:", weixinOauth2Token.toString());
                // 网页授权接口访问凭证
                String accessToken = weixinOauth2Token.getAccessToken();
                // 用户标识
                String openId = weixinOauth2Token.getOpenId();
                // 获取用户信息
                SNSUserInfo snsUserInfo = PermissionUtil.getSNSUserInfo(accessToken, openId);
                LoggerUtil.info(logger, "get sns user info:", snsUserInfo.toString());
                // 设置要传递的参数
                request.setAttribute("snsUserInfo", snsUserInfo);
                request.setAttribute("state", state);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
