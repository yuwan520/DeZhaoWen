package com.accp.biz.chengjun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.chengjun.vehicleMapper;
import com.accp.pojo.chengjun.vehicle;

@Service("VehicleBiz")
public class VehicleBiz {
  
	@Autowired
	vehicleMapper Dao;
	//查询所有的车
	
	public List<vehicle> find(){
		return Dao.selectByPrimaryKey1();
	}
	
	//新增客户的车
	
	public int add(vehicle dx) {
		
	return 	Dao.insertSelective(dx);
	}
	//查询需要修改的车

	public vehicle find1(String cp) {
		
	return 	Dao.selectByPrimaryKey2(cp);
	}
	
	//修改车
	
	public int xg(vehicle dx) {
		return Dao.updateByPrimaryKeySelective(dx);
		
	}
	//删除车
	public int remove(String cp) {
		return Dao.deleteByPrimaryKey(cp);
		
	}
	
	//查看用户的车
	public List<vehicle> find3(String name){
		return Dao.selectByPrimaryKey3(name);
	}
	
	
}
