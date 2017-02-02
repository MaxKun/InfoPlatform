/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model;

/**
 * 
 * @author MaxKun
 * @version $Id: NewsType.java, v 0.1 2016年6月19日 下午8:56:38 MaxKun Exp $
 */
public enum NewsType {
    News("news", "新闻"), CHOICE("choice", "选择"), TOPIC("topic", "专题");

    /** code */
    private final String code;

    /** desc */
    private final String message;

    /**
    *
    * @param code
    * @param message
    */
    private NewsType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    /**
    * 
    * @param code
    * @return
    */
    public static NewsType getEnumByCode(String code) {
        for (NewsType entry : NewsType.values()) {
            if (entry.getCode().equals(code.trim())) {
                return entry;
            }
        }

        return null;
    }

    /**
    * ����message��ȡö��
    * 
    * @param message
    * @return
    */
    public static NewsType getCardStatusByMessage(String message) {
        for (NewsType entry : NewsType.values()) {
            if (entry.getMessage().equals(message.trim())) {
                return entry;
            }
        }
        return null;
    }
}
