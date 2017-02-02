/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infoplatform.common.dao.CommentDOMapper;
import com.infoplatform.common.util.LoggerUtil;
import com.infoplatform.core.model.Comment;
import com.infoplatform.core.service.CommentCache;
import com.infoplatform.core.service.UserService;

/**
 * 
 * @author MaxKun
 * @version $Id: CommentController.java, v 0.1 2016骞�8鏈�7鏃� 涓嬪崍4:07:05 MaxKun Exp $
 */
@Controller
public class CommentController {

    @Resource
    private UserService     userService;

    @Resource
    private CommentDOMapper commentDOMapper;
    /** logger */
    private static Logger   logger = Logger.getLogger(NewsController.class);

    @RequestMapping(value = "/getComment.htm", method = RequestMethod.GET)
    public String getComment(HttpServletRequest request, Model model) {
        String newsId = request.getParameter("newsId");
        String username = request.getParameter("username");
        String userImage = request.getParameter("userImage");
        String userId = request.getParameter("userId");
        List<Comment> commentList = CommentCache.getCommentListMap().get(newsId);
        if (commentList == null) {
            commentList = new ArrayList<Comment>();
        }
        //        model.addAttribute(commentList);
        request.setAttribute("commentList", commentList);
        model.addAttribute("newsId", newsId);
        model.addAttribute("username", username);
        model.addAttribute("userImage", userImage);
        model.addAttribute("userId", userId);
        return "showComment";
    }

    @RequestMapping(value = "/updateComment.htm", method = RequestMethod.POST)
    public void updateComment(HttpServletRequest request,
                              HttpServletResponse response) throws IOException {
        LoggerUtil.info(logger, "comment update:", request.getParameter("comment"));
        String userId = request.getParameter("userId");
        String newsId = request.getParameter("newsId");
        String comment = request.getParameter("comment");
        userService.insertUserComment(userId, newsId, comment);
    }

    @RequestMapping(value = "/updateUserLike.htm", method = RequestMethod.POST)
    public void updateUserLike(HttpServletRequest request,
                               HttpServletResponse response) throws IOException {
        LoggerUtil.info(logger, "comment update:", request.getParameter("comment"));
        String userId = request.getParameter("userId");
        String newsId = request.getParameter("newsId");
        String type = request.getParameter("type");
        int num = Integer.parseInt(request.getParameter("num"));
        userService.updateUserLike(newsId, type, num);
    }

}
