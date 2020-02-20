package com.accp.biz.yupengcheng;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yupengcheng.teamMapper;
import com.accp.pojo.yupengcheng.class11;
import com.accp.pojo.yupengcheng.team1;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class TeamBiz {

	@Autowired
	private teamMapper teammap;
	
	//分页查询
	public PageInfo<team1> queryAll(int num,String bm){
		PageHelper.startPage(num, 3);
		PageInfo<team1> page=new PageInfo<>(teammap.selectTeamAll(bm));
		return page;
	}
	
	//根据teamno查询
	public List<team1> selectAll(int teamno){
		return teammap.selectByteamno(teamno);
	}
	
	//新增技工
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertAll(team1 record) {
		int ak = teammap.insert(record);
		return ak;
	}
	
	//删除技工
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteByTeamNo(int teamno) {
		int cs = teammap.deleteByTeamNo(teamno);
		return cs;
	}
	
	//修改技工
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateByteamNo(team1 record) {
		int we = teammap.updateInTeam(record);
		return we;
	}
}
