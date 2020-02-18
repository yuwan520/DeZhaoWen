package com.accp.biz.lirui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lirui.dimissionMapper;
import com.accp.pojo.dimission;
import com.accp.pojo.employee;
import com.accp.pojo.lirui.Dimss;
import com.accp.pojo.lirui.Emp;
import com.accp.vo.lirui.CommunicationVo;
import com.accp.vo.lirui.DimissionVo;
import com.accp.vo.lirui.EmpVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("DimissionVoBiz")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class DimissionVoBiz {
  
	@Autowired
	private dimissionMapper  biz;
	
	/**
	 * 查询所有离职信息
	 */
	public PageInfo<DimissionVo> selectDimissionVo(Integer pageNum,Integer pageSize, String empname){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<DimissionVo>(biz.selectDimissionVo(empname));
		
	}
	
	public PageInfo<DimissionVo> selectDimissionVoo(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<DimissionVo>(biz.selectDimissionVoo());
		
	}
	/**
	 * 查询所有员工姓名
	 */
	public List<Emp> selectEmpName(){
		List<Emp> list=biz.selectEmpName();
		return list;
	}
	/**
	 * 添加离职
	 */
	public void addDimission(Dimss record) {
		
		biz.addDimission(record);
	}
	/**
	 * 查询id
	 */
	public EmpVo selectEmpId(String empid) {
		EmpVo emp=biz.selectEmpId(empid);
		return emp;
	}
	/***
	 * 删除员工
	 */
	public int deleteEmpId(String empid) {
		int count=biz.deleteEmpId(empid);
		return count;
	}
	/**
	 * 回滚员工
	 */
	public int deleteDimissionId(String empid) {
		int count=biz.deleteDimissionId(empid);
		return count;
	}
	/**
	 * 查询所有通讯
	 */
	public PageInfo<CommunicationVo> selectCommunicationVo(Integer pageNum,Integer pageSize, String empname){
	 PageHelper.startPage(pageNum, pageSize);
		  return new PageInfo<CommunicationVo>(biz.selectCommunication(empname));
	}
	
	public PageInfo<CommunicationVo> selectCommun(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		  return new PageInfo<CommunicationVo>(biz.selectCommun());
	}
	
	/**
	 * 查询单个通讯
	 */
	public CommunicationVo selectById(String empid) {
		CommunicationVo com=biz.selectById(empid);
		return com;
	}
	/**
	 * 修改
	 */
	public void updateEmp(Emp emp) {
		
		biz.updateEmp(emp);
	}
}
