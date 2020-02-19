package com.accp.dao.lirui;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.lirui.department;
import com.accp.pojo.lirui.employee;
import com.accp.pojo.lirui.payroll;
import com.accp.pojo.lirui.post;
import com.accp.pojo.lirui.shop;
import com.accp.pojo.lirui.Emp;
import com.accp.vo.lirui.EmpVo;

public interface employeeMapper {
    int deleteByPrimaryKey(String empid);

    int insert(employee record);

    int insertSelective(employee record);

    employee selectByPrimaryKey(String empid);

    int updateByPrimaryKeySelective(employee record);

    int updateByPrimaryKey(employee record);
    
    List<EmpVo> selectEmptNameId(@Param("empname") String empname);
    
    List<EmpVo> selectEmpAll();
    
    List<EmpVo> selectDepartmentName(@Param("departmentid") String departmentid);
    
    List<shop> selectShopname();
    
    List<payroll> selectPayroll();
    
    List<post> selectPost();
    
    List<department> selectDepartment();
    
    int addEmp(Emp emp);
    
    int deleteEmpid(@Param("empid") String empid);
    
    List<Emp> selectEmpId(@Param("empid") String empid);
    
    int updateEmployee(Emp empp);
}