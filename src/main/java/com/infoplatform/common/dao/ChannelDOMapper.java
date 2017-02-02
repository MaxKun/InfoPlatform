package com.infoplatform.common.dao;

import java.util.List;

import com.infoplatform.common.daoobject.ChannelDO;

public interface ChannelDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChannelDO record);

    int insertSelective(ChannelDO record);

    ChannelDO selectByPrimaryKey(Integer id);

    List<ChannelDO> getAll();

    int updateByPrimaryKeySelective(ChannelDO record);

    int updateByPrimaryKey(ChannelDO record);
}