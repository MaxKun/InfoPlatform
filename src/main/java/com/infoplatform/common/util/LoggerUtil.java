/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.common.util;

import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.Logger;

/**
 * 规范化日志打印工具。
 *
 * <p>注意日志的级别选择:

 * <ol>
 *  <li>DEBUG <b>开发环境</b>应用调试，输出详细的应用状态。
 *  <li>INFO <b>生产环境</b>运行状态观察，输出应用生命周期的中<b>正常重要事件</b>。
 *  <li>WARN <b>生产环境</b>故障诊断，输出应用中的<b>可预期的异常事件</b>。
 *  <li>ERROR <b>生产环境</b>境故障诊断，输出应用中的<b>未预期的异常事件</b>。
 * </ol>
 * @author MaxKun
 * @version $Id: LoggerUtil.java, v 0.1 2015年12月9日 下午7:53:08 MaxKun Exp $
 */
public class LoggerUtil {
    /** LOG */

    /** 集合对象日志输出的元素最大个数 */
    private final static int MAX_COL_LOG_SIZE = 10;

    /**
     * 防止实例化。
     */
    private LoggerUtil() {
    }

    /** 格式化开始符号 */
    public static final String FMT_BEGIN    = "[(";

    /** 格式化中间符号 */
    public static final String FMT_MIDDLE   = ")(";

    /** 格式化结束符号 */
    public static final String FMT_END      = ")]";

    /** 毫秒 */
    public static final String MS           = "ms";

    /** 没有值时日志上以-替代 */
    public static final String NONE         = "-";

    /** 逗号 */
    public static final String COMMA        = ",";

    /** 点号 */
    public static final String DOT          = ".";

    /** 业务成功标识 */
    public static final String YES          = "Y";

    /** 业务失败标识 */
    public static final String NO           = "N";

    /** 下划线 */
    public static final String UNDERLINE    = "_";

    /** 未知错误 */
    public static final String UNKNOW_ERROR = "UNKNOW_ERROR";

    /**
     * 对dal-digest日志进行格式化: [(dsId,call.method,Y,1ms)(invokeId)]
     * @param dsId 数据源id
     * @param method 方法
     * @param hasError 是否有异常
     * @param elapseTimeInMillis 时间in ms
     * @return 格式化串
     */
    //    public static String formatDAL(String dsId, String method, boolean hasError,
    //                                   long elapseTimeInMillis) {
    //        StringBuilder sb = new StringBuilder();
    //
    //        sb.append(FMT_BEGIN).append(ifBlank(dsId)).append(COMMA).append(method).append(COMMA)
    //            .append(hasError ? NO : YES).append(COMMA).append(elapseTimeInMillis).append(MS)
    //            .append(FMT_MIDDLE).append(ifBlank(TracerContextUtil.getTraceId())).append(FMT_END);
    //
    //        return sb.toString();
    //    }

    /**
     * 对task-digest日志进行格式化: [(taskDate,taskName,action,Y,1ms)(tntinstId,ipId,argmntNo,-,-,-)]
     * 
     * @param taskDate   任务日期
     * @param taskName   任务名
     * @param action     动作
     * @param hasError   是否有错误
     * @param elapsInMs  耗时，单位ms
     * @param tntInstId  租户id
     * @param ipId       用户id
     * @param argmntNo   合约号
     * @param extInfos   扩展字段,最多支持3个
     * @return 格式化串
     */
    //    public static String formatTaskDigest(String taskDate, String taskName, String action,
    //                                          boolean hasError, long elapsInMs, String tntInstId,
    //                                          String ipId, String argmntNo, String[] extInfos) {
    //        StringBuilder sb = new StringBuilder();
    //
    //        sb.append(FMT_BEGIN);
    //
    //        sb.append(taskDate).append(COMMA);
    //        sb.append(taskName).append(COMMA);
    //        sb.append(action).append(COMMA);
    //        sb.append(hasError ? NO : YES).append(COMMA);
    //        sb.append(elapsInMs).append(MS);
    //
    //        sb.append(FMT_MIDDLE);
    //
    //        sb.append(ifBlank(tntInstId)).append(COMMA);
    //        sb.append(ifBlank(ipId)).append(COMMA);
    //        sb.append(ifBlank(argmntNo));
    //        /** 默认的extInfo,最多支持3个 */
    //        String[] defaultExtInfo = { NONE, NONE, NONE };
    //        if (extInfos == null) {
    //            extInfos = defaultExtInfo;
    //        }
    //        for (int i = 0, realLen = Math.min(extInfos.length, 3); i < 3; i++) {
    //            if (i < realLen) {
    //                sb.append(COMMA).append(ifBlank(extInfos[i]));
    //            } else {
    //                sb.append(COMMA).append(NONE);
    //            }
    //        }
    //
    //        sb.append(FMT_MIDDLE);
    //        sb.append(TracerContextUtil.getTraceId());
    //
    //        return sb.append(FMT_END).toString();
    //    }

    /**
     * 生成<font color="blue">调试</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger  日志打印对象
     * @param desc    日志描述信息
     */
    public static void debug(Logger logger, String desc) {
        debug(logger, desc, new Object[0]);
    }

    /**
     * 生成<font color="blue">调试</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger  日志打印对象
     * @param desc    日志描述信息
     * @param obj     任意个要输出到日志的参数[可空]
     */
    public static void debug(Logger logger, String desc, Object... obj) {
        if (logger.isDebugEnabled()) {
            logger.debug(getLogString(desc, obj));
        }
    }

    /**
     * 生成<font color="blue">通知</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger  日志打印对象
     * @param desc    日志描述信息
     */
    public static void info(Logger logger, String desc) {
        info(logger, desc, new Object[0]);
    }

    /**
     * 生成<font color="blue">通知</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger  日志打印对象
     * @param desc    日志描述信息
     * @param obj     任意个要输出到日志的参数[可空]
     */
    public static void info(Logger logger, String desc, Object... obj) {
        if (logger.isInfoEnabled()) {
            logger.info(getLogString(desc, obj));
        }
    }

    /**
     * 生成<font color="brown">警告</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger  日志打印对象
     * @param desc    日志描述信息
     */
    public static void warn(Logger logger, String desc) {
        warn(logger, desc, null, new Object[0]);
    }

    /**
     * 生成<font color="brown">警告</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger  日志打印对象
     * @param desc    日志描述信息
     * @param e       错误
     */
    public static void warn(Logger logger, String desc, Throwable e) {
        warn(logger, desc, e, new Object[0]);
    }

    /**
     * 生成<font color="brown">警告</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger  日志打印对象
     * @param desc    日志描述信息
     * @param obj     任意个要输出到日志的参数[可空]
     */
    public static void warn(Logger logger, String desc, Object... obj) {
        warn(logger, desc, null, obj);
    }

    /**
     * 生成<font color="brown">警告</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger  日志打印对象
     * @param desc    日志描述信息
     * @param e       错误
     * @param obj     任意个要输出到日志的参数[可空]
     */
    public static void warn(Logger logger, String desc, Throwable e, Object... obj) {
        if (e == null) {
            logger.warn(getLogString(desc, obj));
        } else {
            logger.warn(getLogString(desc, obj), e);
        }
    }

    /**
     * 生成<font color="red">错误</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger    日志打印对象
     * @param desc      日志描述信息
     */
    public static void error(Logger logger, String desc) {
        error(logger, desc, new Object[0]);
    }

    /**
     * 生成<font color="red">错误</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger    日志打印对象
     * @param desc      日志描述信息
     * @param obj       任意个要输出到日志的参数[可空]
     */
    public static void error(Logger logger, String desc, Object... obj) {
        error(logger, desc, null, obj);
    }

    /**
     * 生成<font color="red">错误</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger    日志打印对象
     * @param desc      日志描述信息
     * @param e         异常堆栈[可空]
     */
    public static void error(Logger logger, String desc, Throwable e) {
        error(logger, desc, e, new Object[0]);
    }

    /**
     * 生成<font color="red">错误</font>级别日志。<br>
     *
     * <p>可处理任意多个输入参数，并避免在日志级别不够时字符串拼接带来的资源浪费。
     *
     * @param logger    日志打印对象
     * @param desc      日志描述信息
     * @param e         异常堆栈[可空]
     * @param obj       任意个要输出到日志的参数[可空]
     */
    public static void error(Logger logger, String desc, Throwable e, Object... obj) {
        if (e == null) {
            logger.error(getLogString(desc, obj));
        } else {
            logger.error(getLogString(desc, obj), e);
        }
    }

    /**
     * 生成输出到日志的字符串。
     *
     * @param desc    日志描述信息
     * @param obj     任意个要输出到日志的参数[可空]
     * @return 输出到日志的字符串
     */
    public static String getLogString(String desc, Object... obj) {

        StringBuilder sb = new StringBuilder();
        sb.append(desc);
        if (obj != null && obj.length > 0) {
            sb.append("(");
            for (int i = 0, len = obj.length; i < len; i++) {
                if (obj[i] instanceof Collection) {
                    Collection<?> col = (Collection<?>) obj[i];
                    int length = Math.min(MAX_COL_LOG_SIZE, col.size());
                    Object[] subArray = new Object[length];
                    System.arraycopy(col.toArray(), 0, subArray, 0, length);
                    sb.append(Arrays.toString(subArray));
                } else {
                    sb.append(obj[i]);
                }
                if (i != len - 1) {
                    sb.append(COMMA);
                }
            }
            sb.append(")");
        }

        sb.append("(");
        sb.append(")");

        return sb.toString();
    }

    /**
     * 入参为null或者空串时,返回"-",否则返回自身
     *
     * @param value 入参字符串
     * @return 入参为null或者空串时, 返回"-",否则返回自身
     */
    //    private static String ifBlank(String value) {
    //        return StringUtil.isBlank(value) ? NONE : value;
    //    }
}
