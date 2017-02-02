package com.infoplatform.common.dao;

import java.util.List;

import com.infoplatform.common.daoobject.NewsDO;

public interface NewsDOMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(NewsDO record);

    int insertSelective(NewsDO record);

    NewsDO selectByPrimaryKey(Integer newsId);

    List<NewsDO> getAll();

    int updateByPrimaryKeySelective(NewsDO record);

    int updateByPrimaryKey(NewsDO record);
}