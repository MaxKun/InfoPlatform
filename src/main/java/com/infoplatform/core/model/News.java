/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model;

import java.util.Date;

/**
 * 
 * @author MaxKun
 * @version $Id: Info.java, v 0.1 2016骞�6鏈�5鏃� 涓嬪崍9:35:53 MaxKun Exp $
 */
public class News implements Comparable {

    private String  id;

    private String  channelName;

    private String  channelPic;

    private String  type;

    private boolean isTopic;

    private String  picUp;

    private String  picDown;

    private String  content;

    private String  channelId;

    private int     likesUp;

    private int     likesDown;

    private int     dislikes;

    private int     priority;

    private Date    dateStart;
    private Date    dateEnd;

    private Date    dateCreate;

    private String  descLeft;

    private String  descRight;

    /**
     * Getter method for property <tt>isTopic</tt>.
     * 
     * @return property value of isTopic
     */
    public boolean isTopic() {
        return isTopic;
    }

    /**
     * Setter method for property <tt>isTopic</tt>.
     * 
     * @param isTopic value to be assigned to property isTopic
     */
    public void setTopic(boolean isTopic) {
        this.isTopic = isTopic;
    }

    /**
     * Getter method for property <tt>descLeft</tt>.
     * 
     * @return property value of descLeft
     */
    public String getDescLeft() {
        return descLeft;
    }

    /**
     * Setter method for property <tt>descLeft</tt>.
     * 
     * @param descLeft value to be assigned to property descLeft
     */
    public void setDescLeft(String descLeft) {
        this.descLeft = descLeft;
    }

    /**
     * Getter method for property <tt>descRight</tt>.
     * 
     * @return property value of descRight
     */
    public String getDescRight() {
        return descRight;
    }

    /**
     * Setter method for property <tt>descRight</tt>.
     * 
     * @param descRight value to be assigned to property descRight
     */
    public void setDescRight(String descRight) {
        this.descRight = descRight;
    }

    /** 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Object o) {
        News newsObject = (News) o;
        if (this.priority < newsObject.getPriority()) {
            return -1;
        } else if (this.priority == newsObject.getPriority()
                   && this.getDateCreate().before(newsObject.getDateCreate())) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Getter method for property <tt>channelName</tt>.
     * 
     * @return property value of channelName
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Setter method for property <tt>channelName</tt>.
     * 
     * @param channelName value to be assigned to property channelName
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * Getter method for property <tt>channelPic</tt>.
     * 
     * @return property value of channelPic
     */
    public String getChannelPic() {
        return channelPic;
    }

    /**
     * Setter method for property <tt>channelPic</tt>.
     * 
     * @param channelPic value to be assigned to property channelPic
     */
    public void setChannelPic(String channelPic) {
        this.channelPic = channelPic;
    }

    /**
     * Getter method for property <tt>type</tt>.
     * 
     * @return property value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for property <tt>type</tt>.
     * 
     * @param type value to be assigned to property type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter method for property <tt>picUp</tt>.
     * 
     * @return property value of picUp
     */
    public String getPicUp() {
        return picUp;
    }

    /**
     * Setter method for property <tt>picUp</tt>.
     * 
     * @param picUp value to be assigned to property picUp
     */
    public void setPicUp(String picUp) {
        this.picUp = picUp;
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
     * Getter method for property <tt>picDown</tt>.
     * 
     * @return property value of picDown
     */
    public String getPicDown() {
        return picDown;
    }

    /**
     * Setter method for property <tt>picDown</tt>.
     * 
     * @param picDown value to be assigned to property picDown
     */
    public void setPicDown(String picDown) {
        this.picDown = picDown;
    }

    /**
     * Getter method for property <tt>dateCreate</tt>.
     * 
     * @return property value of dateCreate
     */
    public Date getDateCreate() {
        return dateCreate;
    }

    /**
     * Setter method for property <tt>dateCreate</tt>.
     * 
     * @param dateCreate value to be assigned to property dateCreate
     */
    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
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
     * Getter method for property <tt>channelId</tt>.
     * 
     * @return property value of channelId
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Setter method for property <tt>channelId</tt>.
     * 
     * @param channelId value to be assigned to property channelId
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * Getter method for property <tt>likesUp</tt>.
     * 
     * @return property value of likesUp
     */
    public int getLikesUp() {
        return likesUp;
    }

    /**
     * Setter method for property <tt>likesUp</tt>.
     * 
     * @param likesUp value to be assigned to property likesUp
     */
    public void setLikesUp(int likesUp) {
        this.likesUp = likesUp;
    }

    /**
     * Getter method for property <tt>likesDown</tt>.
     * 
     * @return property value of likesDown
     */
    public int getLikesDown() {
        return likesDown;
    }

    /**
     * Setter method for property <tt>likesDown</tt>.
     * 
     * @param likesDown value to be assigned to property likesDown
     */
    public void setLikesDown(int likesDown) {
        this.likesDown = likesDown;
    }

    /**
     * Getter method for property <tt>dislikes</tt>.
     * 
     * @return property value of dislikes
     */
    public int getDislikes() {
        return dislikes;
    }

    /**
     * Setter method for property <tt>dislikes</tt>.
     * 
     * @param dislikes value to be assigned to property dislikes
     */
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    /**
     * Getter method for property <tt>priority</tt>.
     * 
     * @return property value of priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Setter method for property <tt>priority</tt>.
     * 
     * @param priority value to be assigned to property priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * Getter method for property <tt>dateStart</tt>.
     * 
     * @return property value of dateStart
     */
    public Date getDateStart() {
        return dateStart;
    }

    /**
     * Setter method for property <tt>dateStart</tt>.
     * 
     * @param dateStart value to be assigned to property dateStart
     */
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * Getter method for property <tt>dateEnd</tt>.
     * 
     * @return property value of dateEnd
     */
    public Date getDateEnd() {
        return dateEnd;
    }

    /**
     * Setter method for property <tt>dateEnd</tt>.
     * 
     * @param dateEnd value to be assigned to property dateEnd
     */
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

}
