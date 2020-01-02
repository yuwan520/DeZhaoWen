package com.accp.dao;

import com.accp.pojo.employee;

public interface employeeMapper {
    int deleteByPrimaryKey(String empid);

    int insert(employee record);

    int insertSelective(employee record);

    employee selectByPrimaryKey(String empid);

    int updateByPrimaryKeySelective(employee record);

    int updateByPrimaryKey(employee record);
}