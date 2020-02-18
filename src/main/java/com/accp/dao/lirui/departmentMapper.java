package com.accp.dao.lirui;

import java.util.List;

import com.accp.pojo.department;

public interface departmentMapper {
    int deleteByPrimaryKey(String departmentid);

    int insert(department record);

    int insertSelective(department record);

    department selectByPrimaryKey(String departmentid);

    int updateByPrimaryKeySelective(department record);

    int updateByPrimaryKey(department record);
    
    List<department> selectName();
}