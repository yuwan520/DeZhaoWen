package com.accp.dao;

import com.accp.pojo.projecttype;

public interface projecttypeMapper {
    int deleteByPrimaryKey(String pno);

    int insert(projecttype record);

    int insertSelective(projecttype record);

    projecttype selectByPrimaryKey(String pno);

    int updateByPrimaryKeySelective(projecttype record);

    int updateByPrimaryKey(projecttype record);
}