/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.service;

import org.apache.log4j.Logger;

import com.infoplatform.common.SystemConstant;
import com.infoplatform.common.util.LoggerUtil;
import com.infoplatform.common.util.SignUtil;

/**
 * 
 * @author MaxKun
 * @version $Id: SignatureCache.java, v 0.1 2016年7月8日 下午11:05:48 MaxKun Exp $
 */
public class SignatureUtil {

    private static Logger logger     = Logger.getLogger(SignatureUtil.class);

    private static String signature1 = "a";
    private static String signature2 = "a";

    private static String timestamp  = "a";

    private void refresh() {
        String accessToken = PermissionUtil.getAccessToken();
        LoggerUtil.info(logger, "access_token=", accessToken);

        String jsapiTicket = PermissionUtil.getJsapiTicket(accessToken);
        LoggerUtil.info(logger, "jsapi_ticket=" + jsapiTicket);

        //获取签名signature
        String noncestr = SystemConstant.noncestr;
        timestamp = Long.toString(System.currentTimeMillis() / 1000);
        String url = "http://www.yonxipay.com/InfoPlatform/getTopic.htm";
        String str = "jsapi_ticket=" + jsapiTicket + "&noncestr=" + noncestr + "&timestamp="
                     + timestamp + "&url=" + url;
        //sha1加密
        signature1 = SignUtil.SHA1(str);

        String url2 = "http://www.yonxipay.com/InfoPlatform/getTopic.htm?from=timeline&isappinstalled=0";
        String str2 = "jsapi_ticket=" + jsapiTicket + "&noncestr=" + noncestr + "&timestamp="
                      + timestamp + "&url=" + url2;
        //sha1加密
        signature2 = SignUtil.SHA1(str2);
        LoggerUtil.info(logger, "noncestr=", noncestr);
        LoggerUtil.info(logger, "timestamp=", timestamp);
        LoggerUtil.info(logger, "signature=", signature1);
    }

    /**
     * Getter method for property <tt>signature1</tt>.
     * 
     * @return property value of signature1
     */
    public static String getSignature1() {
        return signature1;
    }

    /**
     * Getter method for property <tt>signature2</tt>.
     * 
     * @return property value of signature2
     */
    public static String getSignature2() {
        return signature2;
    }

    /**
     * Getter method for property <tt>timestamp</tt>.
     * 
     * @return property value of timestamp
     */
    public static String getTimestamp() {
        return timestamp;
    }

}
