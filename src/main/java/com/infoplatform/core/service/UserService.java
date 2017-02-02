package com.infoplatform.core.service;

import com.infoplatform.common.daoobject.UserDO;
import com.infoplatform.core.model.SNSUserInfo;

public interface UserService {
    public UserDO getUserById(int userId);

    public int insertUserInfo(SNSUserInfo snsUserInfo);

    public boolean refreshAcceessToken();

    public int insertUserComment(String userId, String newsId, String comment);

    public void updateUserLike(String newsId, String type, int num);
}
