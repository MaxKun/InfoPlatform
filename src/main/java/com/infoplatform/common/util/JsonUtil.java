/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.infoplatform.common.util;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * 
 * @author MaxKun
 * @version $Id: JsonUtil.java, v 0.1 2015年12月10日 下午2:24:58 MaxKun Exp $
 */
public class JsonUtil {

    /**
     * JSON2OBJECT
     *
     * @param json
     * @param beanClazz
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> T parseJson2Object(String json, Class<T> beanClazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, beanClazz);
    }

    /**
     * OBJECT2JOSN
     *
     * @param object
     * @return
     * @throws IOException
     */
    public static String parseObject2Json(Object object) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
}
