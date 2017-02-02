/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model;

import java.util.Date;

/**
 * 
 * @author MaxKun
 * @version $Id: Commnet.java, v 0.1 2016年6月19日 下午7:42:23 MaxKun Exp $
 */
public class Comment {

    private String id;

    /** 用户名 */
    private String userName;
    /** 头像 */
    private String portrait;
    /** 关联的新闻 */
    private String newId;
    /** 评论内容 */
    private String content;
    /** 评论时间 */
    private Date   time;
    /** 点赞数量 */
    private int    likes;

    /**
     * Getter method for property <tt>userName</tt>.
     * 
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>userName</tt>.
     * 
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property <tt>portrait</tt>.
     * 
     * @return property value of portrait
     */
    public String getPortrait() {
        return portrait;
    }

    /**
     * Setter method for property <tt>portrait</tt>.
     * 
     * @param portrait value to be assigned to property portrait
     */
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    /**
     * Getter method for property <tt>newId</tt>.
     * 
     * @return property value of newId
     */
    public String getNewId() {
        return newId;
    }

    /**
     * Setter method for property <tt>newId</tt>.
     * 
     * @param newId value to be assigned to property newId
     */
    public void setNewId(String newId) {
        this.newId = newId;
    }

    /**
     * Getter method for property <tt>content</tt>.
     * 
     * @return property value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Setter method for property <tt>content</tt>.
     * 
     * @param content value to be assigned to property content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter method for property <tt>time</tt>.
     * 
     * @return property value of time
     */
    public Date getTime() {
        return time;
    }

    /**
     * Setter method for property <tt>time</tt>.
     * 
     * @param time value to be assigned to property time
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * Getter method for property <tt>id</tt>.
     * 
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     * 
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>likes</tt>.
     * 
     * @return property value of likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Setter method for property <tt>likes</tt>.
     * 
     * @param likes value to be assigned to property likes
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }

}
