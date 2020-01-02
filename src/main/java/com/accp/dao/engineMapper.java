package com.accp.dao;

import com.accp.pojo.engine;

public interface engineMapper {
    int deleteByPrimaryKey(String engineid);

    int insert(engine record);

    int insertSelective(engine record);

    engine selectByPrimaryKey(String engineid);

    int updateByPrimaryKeySelective(engine record);

    int updateByPrimaryKey(engine record);
}