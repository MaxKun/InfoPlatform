/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

import com.infoplatform.common.dao.ChannelDOMapper;
import com.infoplatform.common.dao.NewsDOMapper;
import com.infoplatform.common.daoobject.ChannelDO;
import com.infoplatform.common.daoobject.NewsDO;
import com.infoplatform.common.util.QuickSort;
import com.infoplatform.core.model.Channel;
import com.infoplatform.core.model.News;
import com.infoplatform.core.model.NewsType;
import com.infoplatform.core.model.converter.ChannelConverter;
import com.infoplatform.core.model.converter.NewsConverter;

/**
 * 
 * @author MaxKun
 * @version $Id: NewsCache.java, v 0.1 2016年6月5日 下午9:42:29 MaxKun Exp $
 */
public class NewsCache implements InitializingBean {

    private static Logger               logger     = Logger.getLogger(InitializingBean.class);

    private static List<News>           newsList   = new ArrayList<News>();

    private static List<News>           topicList  = new ArrayList<News>();

    private static Map<String, Channel> channelMap = new HashMap<String, Channel>();

    @Resource
    private NewsDOMapper                newsDOMapper;

    @Resource
    private ChannelDOMapper             channelDOMapper;

    /** 
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        refresh();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(15 * 1000);
                        refresh();
                    } catch (Exception e) {
                        logger.error("新闻缓存刷新出现异常", e);
                    }
                }
            }
        }.start();
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    private void refresh() {
        Map<String, Channel> tempChannelMap = new HashMap<String, Channel>();
        List<ChannelDO> channelDOList = channelDOMapper.getAll();
        for (ChannelDO channelDO : channelDOList) {
            tempChannelMap.put(String.valueOf(channelDO.getId()),
                ChannelConverter.toChannel(channelDO));
        }
        channelMap = tempChannelMap;

        List<NewsDO> newsDOList = newsDOMapper.getAll();
        List<News> tempNewsList = new ArrayList<News>();
        List<News> tempTopicList = new ArrayList<News>();
        for (NewsDO newsDo : newsDOList) {
            News news = NewsConverter.toNews(newsDo);
            news.setChannelName(channelMap.get(news.getChannelId()).getName());
            news.setChannelPic(channelMap.get(news.getChannelId()).getPic());
            if (news.getType().contains(NewsType.TOPIC.getCode())) {
                tempTopicList.add(news);
            } else {
                tempNewsList.add(news);
            }

        }
        QuickSort.sort(tempNewsList);
        QuickSort.sort(tempTopicList);
        newsList = tempNewsList;
        topicList = tempTopicList;
    }

    /**
     * Getter method for property <tt>newsList</tt>.
     * 
     * @return property value of newsList
     */
    public static List<News> getNewsList() {
        return newsList;
    }

    /**
     * Getter method for property <tt>topicList</tt>.
     * 
     * @return property value of topicList
     */
    public static List<News> getTopicList() {
        return topicList;
    }
}
