package com.accp.biz.chengjun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.vehicleMapper;
import com.accp.pojo.vehicle;

@Service("VehicleBiz")
public class VehicleBiz {
  
	@Autowired
	vehicleMapper Dao;
	//查询所有的车
	
	public List<vehicle> find(){
		return Dao.selectByPrimaryKey1();
	}
}
