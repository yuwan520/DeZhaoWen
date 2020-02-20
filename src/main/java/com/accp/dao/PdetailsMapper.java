package com.accp.dao;

import com.accp.pojo.Pdetails;

public interface PdetailsMapper {
    int deleteByPrimaryKey(String detailno);

    int insert(Pdetails record);

    int insertSelective(Pdetails record);

    Pdetails selectByPrimaryKey(String detailno);

    int updateByPrimaryKeySelective(Pdetails record);

    int updateByPrimaryKey(Pdetails record);
}