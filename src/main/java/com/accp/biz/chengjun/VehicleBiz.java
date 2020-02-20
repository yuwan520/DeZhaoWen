package com.accp.biz.chengjun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.chengjun.vehicleMapper1;
import com.accp.pojo.chengjun.vehicle1;

@Service("VehicleBiz")
public class VehicleBiz {
  
	@Autowired
	vehicleMapper1 Dao;
	//查询所有的车
	
	public List<vehicle1> find(){
		return Dao.selectByPrimaryKey1();
	}
	
	//新增客户的车
	
	public int add(vehicle1 dx) {
		
	return 	Dao.insertSelective(dx);
	}
	//查询需要修改的车

	public vehicle1 find1(String cp) {
		
	return 	Dao.selectByPrimaryKey2(cp);
	}
	
	//修改车
	
	public int xg(vehicle1 dx) {
		return Dao.updateByPrimaryKeySelective(dx);
		
	}
	//删除车
	public int remove(String cp) {
		return Dao.deleteByPrimaryKey(cp);
		
	}
	
	//查看用户的车
	public List<vehicle1> find3(String name){
		return Dao.selectByPrimaryKey3(name);
	}
	
	
}
