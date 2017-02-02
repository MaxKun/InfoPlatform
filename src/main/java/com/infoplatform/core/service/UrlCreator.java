/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.service;

import java.io.UnsupportedEncodingException;

/**
 * 
 * @author MaxKun
 * @version $Id: UrlCreator.java, v 0.1 2016年6月30日 下午9:53:22 MaxKun Exp $
 */
public class UrlCreator {

    /**     
     * 方法名：main</br>
     * 详述：生成URL编码 </br>
     * 开发人员：souvc </br>
     * 创建时间：2016-1-4  </br>
     * @param args 说明返回值含义
     * @throws 说明发生此异常的条件
     */
    public static void main(String[] args) {
        String source = "http://www.yonxipay.com/InfoPlatform/getTopic.htm";
        String transSource = urlEncodeUTF8(source);

        //        System.out.println(transSource);

        String targetUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx79e8893e69692ba8&redirect_uri=REDIRECT_URI&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect";
        System.out.println(targetUrl.replace("REDIRECT_URI", transSource));
    }

    public static String urlEncodeUTF8(String source) {
        String result = source;
        try {
            result = java.net.URLEncoder.encode(source, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }


}
