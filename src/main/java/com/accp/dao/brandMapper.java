package com.accp.dao;

import com.accp.pojo.brand;

public interface brandMapper {
    int deleteByPrimaryKey(String brandid);

    int insert(brand record);

    int insertSelective(brand record);

    brand selectByPrimaryKey(String brandid);

    int updateByPrimaryKeySelective(brand record);

    int updateByPrimaryKey(brand record);
}