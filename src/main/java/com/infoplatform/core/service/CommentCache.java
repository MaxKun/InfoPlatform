/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

import com.infoplatform.common.dao.CommentDOMapper;
import com.infoplatform.common.dao.UserDOMapper;
import com.infoplatform.common.daoobject.CommentDO;
import com.infoplatform.common.daoobject.UserDO;
import com.infoplatform.core.model.Comment;
import com.infoplatform.core.model.User;
import com.infoplatform.core.model.converter.CommentConverter;
import com.infoplatform.core.model.converter.UserConverter;

/**
 * 
 * @author MaxKun
 * @version $Id: CommentCache.java, v 0.1 2016年6月20日 下午12:24:18 MaxKun Exp $
 */
public class CommentCache implements InitializingBean {

    private static Logger   logger         = Logger.getLogger(InitializingBean.class);
    private static Map<String /** newsId*/
    , List<Comment>>        commentListMap = new HashMap<String, List<Comment>>();

    private static Map<String/** userId */
    , User>                 userMap        = new HashMap<String, User>();

    @Resource
    private UserDOMapper    userDOMapper;

    @Resource
    private CommentDOMapper commentDOMapper;

    /** 
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        refresh();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(8 * 1000);
                        refresh();
                    } catch (Exception e) {
                        logger.error("评论缓存刷新出现异常", e);
                    }
                }
            }
        }.start();
    }

    /**
     * 
     */
    private void refresh() {
        //加载所有用户
        List<UserDO> userDOList = userDOMapper.getAll();
        Map<String, User> tempUserMap = new HashMap<String, User>();
        for (UserDO userDO : userDOList) {
            tempUserMap.put(String.valueOf(userDO.getId()), UserConverter.toUser(userDO));
        }
        userMap = tempUserMap;

        //加载所有评论
        Map<String, List<Comment>> tempCommentListMap = new HashMap<String, List<Comment>>();
        List<CommentDO> commentDOList = commentDOMapper.getAll();
        for (CommentDO commentDO : commentDOList) {
            Comment comment = CommentConverter.toComment(commentDO);
            comment.setUserName(userMap.get(commentDO.getUserid()).getUserName());
            comment.setPortrait(userMap.get(commentDO.getUserid()).getPortrait());

            List<Comment> commentList = tempCommentListMap.get(comment.getNewId());
            if (commentList == null) {
                commentList = new ArrayList<Comment>();
                tempCommentListMap.put(comment.getNewId(), commentList);
            }
            commentList.add(comment);
        }
        commentListMap = tempCommentListMap;
        System.out.println(commentListMap);
    }

    /**
     * Getter method for property <tt>commentListMap</tt>.
     * 
     * @return property value of commentListMap
     */
    public static Map<String, List<Comment>> getCommentListMap() {
        return commentListMap;
    }

    /**
     * Getter method for property <tt>userMap</tt>.
     * 
     * @return property value of userMap
     */
    public static Map<String, User> getUserMap() {
        return userMap;
    }

}
