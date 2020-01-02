package com.accp.dao;

import com.accp.pojo.dimission;

public interface dimissionMapper {
    int deleteByPrimaryKey(String dimissionid);

    int insert(dimission record);

    int insertSelective(dimission record);

    dimission selectByPrimaryKey(String dimissionid);

    int updateByPrimaryKeySelective(dimission record);

    int updateByPrimaryKey(dimission record);
}