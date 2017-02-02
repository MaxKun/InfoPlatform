/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model;

/**
 * 
 * @author MaxKun
 * @version $Id: Token.java, v 0.1 2016年6月30日 下午5:01:11 MaxKun Exp $
 */
public class Token {
    // 接口访问凭证
    private String accessToken;
    // 凭证有效期，单位：秒
    private int    expiresIn;

    /**
     * Getter method for property <tt>accessToken</tt>.
     * 
     * @return property value of accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Setter method for property <tt>accessToken</tt>.
     * 
     * @param accessToken value to be assigned to property accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Getter method for property <tt>expiresIn</tt>.
     * 
     * @return property value of expiresIn
     */
    public int getExpiresIn() {
        return expiresIn;
    }

    /**
     * Setter method for property <tt>expiresIn</tt>.
     * 
     * @param expiresIn value to be assigned to property expiresIn
     */
    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

}
