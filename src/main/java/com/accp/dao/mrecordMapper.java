package com.accp.dao;

import com.accp.pojo.mrecord;

public interface mrecordMapper {
    int deleteByPrimaryKey(String carhno);

    int insert(mrecord record);

    int insertSelective(mrecord record);

    mrecord selectByPrimaryKey(String carhno);

    int updateByPrimaryKeySelective(mrecord record);

    int updateByPrimaryKey(mrecord record);
}