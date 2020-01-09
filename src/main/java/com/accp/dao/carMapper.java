package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.car;
import com.accp.pojo.team;

public interface carMapper {

	List<team> selectAll();
	
	int deleteByNumbercar(@Param("numbercar")String numbercar);
	
    int insert(@Param("car")car record);

    int insertSelective(car record);
}