package com.accp.dao;

import com.accp.pojo.pickcar;

public interface pickcarMapper {
    int deleteByPrimaryKey(String carno);

    int insert(pickcar record);

    int insertSelective(pickcar record);

    pickcar selectByPrimaryKey(String carno);

    int updateByPrimaryKeySelective(pickcar record);

    int updateByPrimaryKey(pickcar record);
}