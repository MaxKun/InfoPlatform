package com.infoplatform.core.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.infoplatform.common.dao.CommentDOMapper;
import com.infoplatform.common.dao.NewsDOMapper;
import com.infoplatform.common.dao.UserDOMapper;
import com.infoplatform.common.daoobject.CommentDO;
import com.infoplatform.common.daoobject.NewsDO;
import com.infoplatform.common.daoobject.UserDO;
import com.infoplatform.common.util.LoggerUtil;
import com.infoplatform.core.model.SNSUserInfo;
import com.infoplatform.core.model.converter.UserConverter;
import com.infoplatform.core.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    /** logger */
    private static Logger   logger = Logger.getLogger(UserServiceImpl.class);
    @Resource
    private UserDOMapper    userDOMapper;

    @Resource
    private NewsDOMapper    newsMapper;

    @Resource
    private CommentDOMapper commentDOMapper;

    @Override
    public UserDO getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDOMapper.selectByPrimaryKey(userId);
    }

    /** 
     * @see com.infoplatform.core.service.UserService#insertUserInfo(com.infoplatform.core.model.SNSUserInfo)
     */
    @Override
    public int insertUserInfo(SNSUserInfo snsUserInfo) {
        LoggerUtil.info(logger, "insert user info:", snsUserInfo.toString());
        UserDO userDO = UserConverter.toUserDO(snsUserInfo);
        userDOMapper.insert(userDO);
        return userDO.getId();
    }

    /** 
     * @see com.infoplatform.core.service.UserService#refreshAcceessToken()
     */
    @Override
    public boolean refreshAcceessToken() {
        return false;
    }

    /** 
     * @see com.infoplatform.core.service.UserService#insertUserComment(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public int insertUserComment(String userId, String newsId, String comment) {
        CommentDO commentDO = new CommentDO();
        commentDO.setComment(comment);
        commentDO.setNewsid(newsId);
        commentDO.setTime(new Date());
        commentDO.setUserid(userId);
        commentDO.setGmtCreate(new Date());
        commentDO.setGmtModified(new Date());
        commentDOMapper.insert(commentDO);
        return commentDO.getId();
    }

    /** 
     * @see com.infoplatform.core.service.UserService#updateUserLike(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void updateUserLike(String newsId, String type, int num) {
        NewsDO newsDo = newsMapper.selectByPrimaryKey(Integer.parseInt(newsId));
        if (StringUtils.equals(type, "likesUp")) {
            newsDo.setLikesUp(newsDo.getLikesUp() + num);
        } else if (StringUtils.equals(type, "likesDown")) {
            newsDo.setLikesDown(newsDo.getLikesDown() + num);
        } else if (StringUtils.equals(type, "dislike")) {
            newsDo.setDislikes(newsDo.getDislikes() + num);
        }
        newsMapper.updateByPrimaryKey(newsDo);
    }

}
