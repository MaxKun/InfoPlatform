package com.infoplatform.test;

import java.util.Date;

import javax.annotation.Resource;

import com.infoplatform.common.SystemConstant;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.infoplatform.common.dao.ChannelDOMapper;
import com.infoplatform.common.dao.CommentDOMapper;
import com.infoplatform.common.dao.NewsDOMapper;
import com.infoplatform.common.dao.UserDOMapper;
import com.infoplatform.common.daoobject.UserDO;
import com.infoplatform.core.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
    private static Logger   logger      = Logger.getLogger(TestMyBatis.class);
    //	private ApplicationContext ac = null;
    @Resource
    private UserService     userService = null;

    @Resource
    private ChannelDOMapper channelDOMapper;

    @Resource
    private CommentDOMapper commentDOMapper;

    @Resource
    private NewsDOMapper    newsDOMapper;

    @Resource
    private UserDOMapper    userDOMapper;

    public static void main(String[] args){
        System.out.println("This is a test.");
    }

    @Test
    public void testUserInsert() {
        UserDO userDO = new UserDO();
        userDO.setUsername("wangldfihong");
        userDO.setPortrait("images/userPic.png");
        userDO.setGmtCreate(new Date());
        userDO.setGmtModified(new Date());
        userDOMapper.insert(userDO);
        logger.info("result:" + userDO.getId());
        userDOMapper.deleteByPrimaryKey(userDO.getId());
    }

    //    @Test
    //    public void testChannelLoad() {
    //        List<ChannelDO> channelDoList = channelDOMapper.getAll();
    //        logger.info(JSON.toJSONString(channelDoList));
    //    }
    //
    //    @Test
    //    public void testCommentLoad() {
    //        List<CommentDO> commentDoList = commentDOMapper.getAll();
    //        logger.info(JSON.toJSONString(commentDoList));
    //    }
    //
    //    @Test
    //    public void testNewsLoad() {
    //        List<NewsDO> newsDoList = newsDOMapper.getAll();
    //        logger.info(JSON.toJSONString(newsDoList));
    //        //        NewsDO newsDoList = newsDOMapper.selectByPrimaryKey(1);
    //        //        logger.info(JSON.toJSONString(newsDoList));
    //    }
    //
    //    @Test
    //    public void testUserLoad() {
    //        List<UserDO> userDoList = userDOMapper.getAll();
    //        logger.info(JSON.toJSONString(userDoList));
    //    }
}
