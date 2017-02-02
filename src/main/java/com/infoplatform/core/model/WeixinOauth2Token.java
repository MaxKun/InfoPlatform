/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 网页授权信息 类
 * @author MaxKun
 * @version $Id: WeixinOauth2Token.java, v 0.1 2016年6月30日 下午5:01:48 MaxKun Exp $
 */
public class WeixinOauth2Token {
    // 网页授权接口调用凭证
    private String accessToken;
    // 凭证有效时长
    private int    expiresIn;
    // 用于刷新凭证
    private String refreshToken;
    // 用户标识
    private String openId;
    // 用户授权作用域
    private String scope;

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

    /**
     * Getter method for property <tt>refreshToken</tt>.
     * 
     * @return property value of refreshToken
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Setter method for property <tt>refreshToken</tt>.
     * 
     * @param refreshToken value to be assigned to property refreshToken
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * Getter method for property <tt>openId</tt>.
     * 
     * @return property value of openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * Setter method for property <tt>openId</tt>.
     * 
     * @param openId value to be assigned to property openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * Getter method for property <tt>scope</tt>.
     * 
     * @return property value of scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * Setter method for property <tt>scope</tt>.
     * 
     * @param scope value to be assigned to property scope
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
