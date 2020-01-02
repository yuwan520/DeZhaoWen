package com.accp.dao;

import com.accp.pojo.maintaininfo;

public interface maintaininfoMapper {
    int deleteByPrimaryKey(String carnumber);

    int insert(maintaininfo record);

    int insertSelective(maintaininfo record);

    maintaininfo selectByPrimaryKey(String carnumber);

    int updateByPrimaryKeySelective(maintaininfo record);

    int updateByPrimaryKey(maintaininfo record);
}