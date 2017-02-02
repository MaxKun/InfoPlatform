/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model.converter;

import com.infoplatform.common.daoobject.CommentDO;
import com.infoplatform.common.util.JsonUtil;
import com.infoplatform.core.model.Comment;

/**
 * 
 * @author MaxKun
 * @version $Id: CommentConverter.java, v 0.1 2016年6月20日 下午12:54:17 MaxKun Exp $
 */
public class CommentConverter {

    public static Comment toComment(CommentDO commentDO) {
        Comment comment = new Comment();
        comment.setId(String.valueOf(commentDO.getId()));
        comment.setContent(commentDO.getComment());
        if (commentDO.getLikes() != null) {
            comment.setLikes(commentDO.getLikes());
        }
        comment.setNewId(commentDO.getNewsid());
        comment.setTime(commentDO.getTime());
        return comment;
    }

    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setId("1");
        comment.setLikes(5);

        try {

            System.out.println(JsonUtil.parseObject2Json(comment));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
