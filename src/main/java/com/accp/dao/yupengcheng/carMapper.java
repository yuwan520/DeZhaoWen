package com.accp.dao.yupengcheng;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.yupengcheng.car;
import com.accp.pojo.yupengcheng.team;

public interface carMapper {

	List<team> selectAll();
	
	int deleteByNumbercar(@Param("numbercar")String numbercar);
	
    int insert(@Param("car")car record);

    int insertSelective(car record);
}