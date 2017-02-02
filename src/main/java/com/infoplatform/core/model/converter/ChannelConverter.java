/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model.converter;

import com.infoplatform.common.daoobject.ChannelDO;
import com.infoplatform.core.model.Channel;

/**
 * 
 * @author MaxKun
 * @version $Id: ChannelConverter.java, v 0.1 2016年6月22日 上午12:22:17 MaxKun Exp $
 */
public class ChannelConverter {

    public static Channel toChannel(ChannelDO channelDO) {
        Channel channel = new Channel();
        channel.setName(channelDO.getName());
        channel.setId(channelDO.getId());
        channel.setPic(channelDO.getPortrait());
        return channel;
    }
}
