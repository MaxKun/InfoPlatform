package com.infoplatform.common.daoobject;

import java.util.Date;

public class NewsDO {
    private Integer newsId;

    private String picUp;

    private String content;

    private String channelId;

    private Integer likesUp;

    private Integer priority;

    private Date dateStart;

    private String picDown;

    private Integer likesDown;

    private Integer dislikes;

    private Date dateEnd;

    private Date gmtCreate;

    private String type;

    private String description;

    private Date gmtModified;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getPicUp() {
        return picUp;
    }

    public void setPicUp(String picUp) {
        this.picUp = picUp == null ? null : picUp.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public Integer getLikesUp() {
        return likesUp;
    }

    public void setLikesUp(Integer likesUp) {
        this.likesUp = likesUp;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public String getPicDown() {
        return picDown;
    }

    public void setPicDown(String picDown) {
        this.picDown = picDown == null ? null : picDown.trim();
    }

    public Integer getLikesDown() {
        return likesDown;
    }

    public void setLikesDown(Integer likesDown) {
        this.likesDown = likesDown;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}