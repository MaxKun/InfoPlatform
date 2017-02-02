/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model.result;

/**
 * 
 * @author MaxKun
 * @version $Id: ResultCode.java, v 0.1 2016年6月19日 下午10:29:52 MaxKun Exp $
 */
public interface ResultCode {

    /**
     * 获取结果码
     * 
     * @return 结果码
     */
    public String getCode();

    /**
     * 获取结果信息
     * 
     * @return 结果信息
     */
    public String getMessage();

    /**
     * 判断是否是成功的结果码
     * 
     * @return 成功结果码返回<code>true</code>;否则返回<code>false</code>
     */
    public boolean isSuccess();
}
