package com.accp.dao.yupengcheng;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.yupengcheng.car;
import com.accp.pojo.yupengcheng.team;

public interface teamMapper {

	List<car> selectAll();
	
	List<team> selectTeamAll(@Param("bm") String bm);
	
	int deleteByTeamNo(@Param("teamno") int teamno);

	int deleteByNumbercar(@Param("numbercar") String numbercar);

	int insert(@Param("record")team record);

	int insertSelective(team record);
	
	int updateInTeam(@Param("record")team record);
	
	List<team> selectByteamno(@Param("teamno") int teamno);
}