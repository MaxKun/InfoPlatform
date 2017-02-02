/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 通过网页授权获取的用户信息
 * @author MaxKun
 * @version $Id: WeixinUserInfo.java, v 0.1 2016年6月30日 下午5:00:24 MaxKun Exp $
 */
public class SNSUserInfo {

    // 用户标识
    private String       openId;
    // 用户昵称
    private String       nickname;
    // 性别（1是男性，2是女性，0是未知）
    private int          sex;
    // 国家
    private String       country;
    // 省份
    private String       province;
    // 城市
    private String       city;
    // 用户头像链接
    private String       headImgUrl;
    // 用户特权信息
    private List<String> privilegeList;

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

    /**
     * Getter method for property <tt>privilegeList</tt>.
     * 
     * @return property value of privilegeList
     */
    public List<String> getPrivilegeList() {
        return privilegeList;
    }

    /**
     * Setter method for property <tt>privilegeList</tt>.
     * 
     * @param privilegeList value to be assigned to property privilegeList
     */
    public void setPrivilegeList(List<String> privilegeList) {
        this.privilegeList = privilegeList;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
