/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model;

/**
 * 
 * @author MaxKun
 * @version $Id: User.java, v 0.1 2016年6月19日 下午8:22:48 MaxKun Exp $
 */
public class User {

    private String userId;
    private String userName;
    private String portrait;

    /**
     * Getter method for property <tt>userId</tt>.
     * 
     * @return property value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     * 
     * @param userId value to be assigned to property userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

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

}
