/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model.result;

/**
 * 
 * @author MaxKun
 * @version $Id: ResultCodeEnum.java, v 0.1 2016年6月19日 下午10:48:20 MaxKun Exp $
 */
public enum ResultCodeEnum implements ResultCode {

    SUCCESS("成功"),

    QUERY_NODATA("未查询到数据"),

    USER_NOTEXIST("用户不存在"),

    USER_NOTLOGIN("用户未登陆"),

    OPERATE_NOTAUTH("操作无权限"),

    SYSYTEM_ERROR("系统失败"),

    PARA_ERROR("输入信息错误"),

    PARA_NOTENOUGH("输入信息缺失"),

    STATUS_NOTSUPPORT("当前状态不支持本操作"),

    DB_ACCESS_ERROR("数据库操作异常");

    /**返回码描述*/
    private final String message;

    ResultCodeEnum(String message) {
        this.message = message;
    }

    /** 
     * @see com.infoplatform.core.model.result.ResultCode#getCode()
     */
    @Override
    public String getCode() {
        return this.name();
    }

    /** 
     * @see com.infoplatform.core.model.result.ResultCode#getMessage()
     */
    @Override
    public String getMessage() {
        return this.message;
    }

    /** 
     * @see com.infoplatform.core.model.result.ResultCode#isSuccess()
     */
    @Override
    public boolean isSuccess() {
        return this == SUCCESS;
    }

}
