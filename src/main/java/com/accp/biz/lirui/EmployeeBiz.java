package com.accp.biz.lirui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lirui.employeeMapper;
import com.accp.pojo.lirui.Emp;
import com.accp.pojo.lirui.department;
import com.accp.pojo.lirui.payroll;
import com.accp.pojo.lirui.post;
import com.accp.pojo.lirui.shop;
import com.accp.vo.lirui.CommunicationVo;
import com.accp.vo.lirui.EmpVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("EmployeeBiz")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class EmployeeBiz {

	
	@Autowired
	private employeeMapper biz;
	
	
	public PageInfo<EmpVo> selectEmpNameId(Integer pageNum,Integer pageSize,String empname){
		PageHelper.startPage(pageNum, pageSize);
		 return new PageInfo<EmpVo>(biz.selectEmptNameId(empname));
	}
	
	public PageInfo<EmpVo> selectEmpAll(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		  return new PageInfo<EmpVo>(biz.selectEmpAll());
		
	}
	
	public PageInfo<EmpVo> selectDepartmentName(Integer pageNum,Integer pageSize,String departmentid){
		PageHelper.startPage(pageNum, pageSize);
		  return new PageInfo<EmpVo>(biz.selectDepartmentName(departmentid));
		
	}
	//赋值门店
	public List<shop> selectShop(){
		List<shop> list=biz.selectShopname();
		return list;
	}
	//赋值计薪
	public List<payroll> selectPayroll(){
		List<payroll> list=biz.selectPayroll();
		return list;
	}
	//赋值岗位
	public List<post> selectPost(){
		List<post> list=biz.selectPost();
		return list;
	}
	//赋值部门
	public List<department> selectDepartment(){
		List<department> list=biz.selectDepartment();
		return list;
	}
	//添加员工
	public void addEmp(Emp emp) {
		biz.addEmp(emp);
	}
	//删除员工
	public int deleteEmpID(String empid) {
		int count=biz.deleteEmpid(empid);
		return count;
	}
	//修改查询id
	public List<Emp> selectId(String empid){
		List<Emp> list=biz.selectEmpId(empid);
		return list;
		
	}
	//修改
	public void updateEmployee(Emp empp) {
		biz.updateEmployee(empp);
	}
}
