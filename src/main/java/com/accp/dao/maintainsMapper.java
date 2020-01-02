package com.accp.dao;

import com.accp.pojo.maintains;

public interface maintainsMapper {
    int deleteByPrimaryKey(String wxorders);

    int insert(maintains record);

    int insertSelective(maintains record);

    maintains selectByPrimaryKey(String wxorders);

    int updateByPrimaryKeySelective(maintains record);

    int updateByPrimaryKey(maintains record);
}