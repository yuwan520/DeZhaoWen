package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.car;
import com.accp.pojo.team;

public interface teamMapper {

	List<car> selectAll();

	int deleteByNumbercar(@Param("numbercar") String numbercar);

	int insert(team record);

	int insertSelective(team record);
}