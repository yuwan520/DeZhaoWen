package com.accp.dao;

import com.accp.pojo.client;

public interface clientMapper {
    int deleteByPrimaryKey(String clientid);

    int insert(client record);

    int insertSelective(client record);

    client selectByPrimaryKey(String clientid);

    int updateByPrimaryKeySelective(client record);

    int updateByPrimaryKey(client record);
}