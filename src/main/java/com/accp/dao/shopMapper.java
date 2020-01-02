package com.accp.dao;

import com.accp.pojo.shop;

public interface shopMapper {
    int deleteByPrimaryKey(String shopid);

    int insert(shop record);

    int insertSelective(shop record);

    shop selectByPrimaryKey(String shopid);

    int updateByPrimaryKeySelective(shop record);

    int updateByPrimaryKey(shop record);
}