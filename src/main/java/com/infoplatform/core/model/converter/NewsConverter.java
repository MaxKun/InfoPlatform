/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model.converter;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.infoplatform.common.daoobject.NewsDO;
import com.infoplatform.common.util.LoggerUtil;
import com.infoplatform.core.model.News;
import com.infoplatform.core.model.NewsType;

/**
 * 
 * @author MaxKun
 * @version $Id: NewsConverter.java, v 0.1 2016年6月19日 下午9:51:47 MaxKun Exp $
 */
public class NewsConverter {
    /** logger */
    private static Logger logger = Logger.getLogger(NewsConverter.class);

    public static News toNews(NewsDO newsDO) {
        News news = new News();
        news.setChannelId(newsDO.getChannelId());
        news.setContent(newsDO.getContent());
        news.setDateCreate(newsDO.getGmtCreate());
        news.setDateStart(newsDO.getDateStart());
        news.setDateEnd(newsDO.getDateEnd());
        System.out.println("newsdo id:" + newsDO.getNewsId());
        news.setId(String.valueOf(newsDO.getNewsId()));
        if (newsDO.getDislikes() != null) {
            news.setDislikes(newsDO.getDislikes());
        }
        if (newsDO.getLikesDown() != null) {
            news.setLikesDown(newsDO.getLikesDown());
        }
        news.setLikesUp(newsDO.getLikesUp());
        if (newsDO.getPicDown() != null) {
            news.setPicDown(newsDO.getPicDown());
        }
        news.setPicUp(newsDO.getPicUp());
        news.setPriority(newsDO.getPriority());
        if (StringUtils.contains(newsDO.getType(), "topic")) {
            news.setTopic(true);
        } else {
            news.setTopic(false);
        }
        if (StringUtils.contains(newsDO.getType(), "choice")) {
            news.setType(NewsType.CHOICE.getCode());
        } else {
            news.setType(NewsType.News.getCode());
        }
        LoggerUtil.info(logger, "description:", newsDO.getDescription());
        if (newsDO.getDescription() != null) {
            String[] descs = newsDO.getDescription().split(":");
            news.setDescLeft(descs[0]);
            news.setDescRight(descs[1]);
            LoggerUtil.info(logger, "left:", descs[0], "right:", descs[1]);
        }
        return news;
    }
}
