package com.accp.dao;

import com.accp.pojo.motorcycle;

public interface motorcycleMapper {
    int deleteByPrimaryKey(String motorcycleid);

    int insert(motorcycle record);

    int insertSelective(motorcycle record);

    motorcycle selectByPrimaryKey(String motorcycleid);

    int updateByPrimaryKeySelective(motorcycle record);

    int updateByPrimaryKey(motorcycle record);
}