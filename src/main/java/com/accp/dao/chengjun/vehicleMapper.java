package com.accp.dao.chengjun;

import java.util.List;

import com.accp.pojo.chengjun.vehicle;

public interface vehicleMapper {
    int deleteByPrimaryKey(String vehiclecp);

    int insert(vehicle record);

    int insertSelective(vehicle record);

    vehicle selectByPrimaryKey(String vehiclecp);
    List<vehicle> selectByPrimaryKey1();
    vehicle selectByPrimaryKey2(String vehiclecp);
    List<vehicle> selectByPrimaryKey3(String name);
    int updateByPrimaryKeySelective(vehicle record);

    int updateByPrimaryKey(vehicle record);
}