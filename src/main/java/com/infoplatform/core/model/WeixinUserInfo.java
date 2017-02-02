/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model;

/**
 * 微信用户的基本信息
 * @author MaxKun
 * @version $Id: WeixinUserInfo.java, v 0.1 2016年6月30日 下午5:03:37 MaxKun Exp $
 */
public class WeixinUserInfo {
    // 用户的标识
    private String openId;
    // 关注状态（1是关注，0是未关注），未关注时获取不到其余信息
    private int    subscribe;
    // 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
    private String subscribeTime;
    // 昵称
    private String nickname;
    // 用户的性别（1是男性，2是女性，0是未知）
    private int    sex;
    // 用户所在国家
    private String country;
    // 用户所在省份
    private String province;
    // 用户所在城市
    private String city;
    // 用户的语言，简体中文为zh_CN
    private String language;
    // 用户头像
    private String headImgUrl;

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
     * Getter method for property <tt>subscribe</tt>.
     * 
     * @return property value of subscribe
     */
    public int getSubscribe() {
        return subscribe;
    }

    /**
     * Setter method for property <tt>subscribe</tt>.
     * 
     * @param subscribe value to be assigned to property subscribe
     */
    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    /**
     * Getter method for property <tt>subscribeTime</tt>.
     * 
     * @return property value of subscribeTime
     */
    public String getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * Setter method for property <tt>subscribeTime</tt>.
     * 
     * @param subscribeTime value to be assigned to property subscribeTime
     */
    public void setSubscribeTime(String subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * Getter method for property <tt>nickname</tt>.
     * 
     * @return property value of nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Setter method for property <tt>nickname</tt>.
     * 
     * @param nickname value to be assigned to property nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Getter method for property <tt>sex</tt>.
     * 
     * @return property value of sex
     */
    public int getSex() {
        return sex;
    }

    /**
     * Setter method for property <tt>sex</tt>.
     * 
     * @param sex value to be assigned to property sex
     */
    public void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * Getter method for property <tt>country</tt>.
     * 
     * @return property value of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter method for property <tt>country</tt>.
     * 
     * @param country value to be assigned to property country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter method for property <tt>province</tt>.
     * 
     * @return property value of province
     */
    public String getProvince() {
        return province;
    }

    /**
     * Setter method for property <tt>province</tt>.
     * 
     * @param province value to be assigned to property province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Getter method for property <tt>city</tt>.
     * 
     * @return property value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for property <tt>city</tt>.
     * 
     * @param city value to be assigned to property city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter method for property <tt>language</tt>.
     * 
     * @return property value of language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Setter method for property <tt>language</tt>.
     * 
     * @param language value to be assigned to property language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Getter method for property <tt>headImgUrl</tt>.
     * 
     * @return property value of headImgUrl
     */
    public String getHeadImgUrl() {
        return headImgUrl;
    }

    /**
     * Setter method for property <tt>headImgUrl</tt>.
     * 
     * @param headImgUrl value to be assigned to property headImgUrl
     */
    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

}
