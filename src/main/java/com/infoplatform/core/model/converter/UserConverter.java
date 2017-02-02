/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model.converter;

import java.util.Date;

import com.infoplatform.common.daoobject.UserDO;
import com.infoplatform.core.model.SNSUserInfo;
import com.infoplatform.core.model.User;

/**
 * 
 * @author MaxKun
 * @version $Id: UserConverter.java, v 0.1 2016年6月20日 下午12:31:19 MaxKun Exp $
 */
public class UserConverter {

    public static User toUser(UserDO userDO) {
        User user = new User();

        user.setUserId(String.valueOf(userDO.getId()));
        user.setUserName(userDO.getUsername());
        user.setPortrait(userDO.getPortrait());

        return user;
    }

    public static UserDO toUserDO(SNSUserInfo snsUserInfo) {
        UserDO userDO = new UserDO();
        userDO.setCity(snsUserInfo.getCity());
        userDO.setCountry(snsUserInfo.getCountry());
        userDO.setOpenId(snsUserInfo.getOpenId());
        userDO.setPortrait(snsUserInfo.getHeadImgUrl());
        userDO.setUsername(snsUserInfo.getNickname());
        userDO.setSex(Integer.toString(snsUserInfo.getSex()));
        userDO.setProvince(snsUserInfo.getProvince());
        userDO.setGmtModified(new Date());
        userDO.setGmtCreate(new Date());
        return userDO;
    }

}
