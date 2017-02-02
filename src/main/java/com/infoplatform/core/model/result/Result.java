/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model.result;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.util.Assert;

/**
 * 业务操作处理结果对象，该类描述了通用的处理结果返回内容。
 * 
 * <p>
 * <b>处理结果对象</b><i>包括处理结果码</i>和<i>处理结果对象</i>包括两部分
 * </p>
 * <ul>
 * <li>处理结果码：主要用于标示处理是成功还是失败，失败时会再细分错误码。结果码需要继承自{@link ResultCode}</li>
 * <li>处理结果对象：表示处理的结果，继承自{@link Object}</li>
 * </ul>
 * @author MaxKun
 * @version $Id: Result.java, v 0.1 2016年6月19日 下午10:28:46 MaxKun Exp $
 */
public class Result<T extends Object> {
    /** 结果码 */
    private final ResultCode resultCode;

    /** 结果对象 */
    private T                resultObject;

    /**
     * 构造函数
     * @param resultCode   不允许为null
     * @param resultObject 可以为null
     */
    public Result(ResultCode resultCode, T resultObject) {
        Assert.notNull(resultCode, "结果码不能为空");

        this.resultObject = resultObject;
        this.resultCode = resultCode;
    }

    /**
     * 构造函数
     * @param resultCode
     */
    public Result(ResultCode resultCode) {
        Assert.notNull(resultCode, "结果码不能为空");
        this.resultCode = resultCode;
    }

    /**
     * 是否处理成功
     * 
     * @return 成功时返回<code>true</code>；否则返回<code>false</code>
     */
    public boolean isSuccess() {
        return getResultCode().isSuccess();
    }

    /**
     * 是否处理不成功
     * 
     * @return 成功时返回<code>false</code>；否则返回<code>true</code>
     */
    public boolean isNotSuccess() {
        return !getResultCode().isSuccess();
    }

    /**
     * 获得处理结果码，通常是在失败时使用。
     * 
     * @return 处理结果码
     */
    public ResultCode getResultCode() {
        return resultCode;
    }

    /**
     * 获得处理结果对象，通常是在成功时使用。
     * 
     * @return 处理结果
     */
    public T getResult() {
        return resultObject;
    }

    /**
     * 获取错误消息
     * 
     * @return
     */
    public String getMessage() {
        return getResultCode().getMessage();
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
