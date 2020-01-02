package com.accp.dao;

import com.accp.pojo.payroll;

public interface payrollMapper {
    int deleteByPrimaryKey(String payrollid);

    int insert(payroll record);

    int insertSelective(payroll record);

    payroll selectByPrimaryKey(String payrollid);

    int updateByPrimaryKeySelective(payroll record);

    int updateByPrimaryKey(payroll record);
}