package com.accp.dao.chengjun;

import java.util.List;

import com.accp.pojo.chengjun.vehicle1;

public interface vehicleMapper1 {
    int deleteByPrimaryKey(String vehiclecp);

    int insert(vehicle1 record);

    int insertSelective(vehicle1 record);

    vehicle1 selectByPrimaryKey(String vehiclecp);
    List<vehicle1> selectByPrimaryKey1();
    vehicle1 selectByPrimaryKey2(String vehiclecp);
    List<vehicle1> selectByPrimaryKey3(String name);
    int updateByPrimaryKeySelective(vehicle1 record);

    int updateByPrimaryKey(vehicle1 record);
}