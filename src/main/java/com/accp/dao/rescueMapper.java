package com.accp.dao;

import com.accp.pojo.rescue;

public interface rescueMapper {
    int deleteByPrimaryKey(String carhao);

    int insert(rescue record);

    int insertSelective(rescue record);

    rescue selectByPrimaryKey(String carhao);

    int updateByPrimaryKeySelective(rescue record);

    int updateByPrimaryKey(rescue record);
}