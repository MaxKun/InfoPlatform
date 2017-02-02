package com.infoplatform.common.dao;

import java.util.List;

import com.infoplatform.common.daoobject.CommentDO;

public interface CommentDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentDO record);

    int insertSelective(CommentDO record);

    CommentDO selectByPrimaryKey(Integer id);

    List<CommentDO> getAll();

    int updateByPrimaryKeySelective(CommentDO record);

    int updateByPrimaryKey(CommentDO record);


}