package com.accp.dao;

import com.accp.pojo.vehicle;

public interface vehicleMapper {
    int deleteByPrimaryKey(String vehiclecp);

    int insert(vehicle record);

    int insertSelective(vehicle record);

    vehicle selectByPrimaryKey(String vehiclecp);

    int updateByPrimaryKeySelective(vehicle record);

    int updateByPrimaryKey(vehicle record);
}