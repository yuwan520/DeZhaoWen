package com.accp.dao.yupengcheng;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.yupengcheng.car;
import com.accp.pojo.yupengcheng.team1;

public interface teamMapper {

	List<car> selectAll();
	
	List<team1> selectTeamAll(@Param("bm") String bm);
	
	int deleteByTeamNo(@Param("teamno") int teamno);

	int deleteByNumbercar(@Param("numbercar") String numbercar);

	int insert(@Param("record")team1 record);

	int insertSelective(team1 record);
	
	int updateInTeam(@Param("record")team1 record);
	
	List<team1> selectByteamno(@Param("teamno") int teamno);
}