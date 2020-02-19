package com.accp.biz.yupengcheng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.teamMapper;
import com.accp.pojo.class1;
import com.accp.pojo.team;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class TeamBiz {

	@Autowired
	private teamMapper teammap;
	
	//分页查询
	public PageInfo<team> queryAll(int num,String bm){
		PageHelper.startPage(num, 3);
		PageInfo<team> page=new PageInfo<>(teammap.selectTeamAll(bm));
		return page;
	}
	
	//新增技工
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertAll(team record) {
		int ak = teammap.insert(record);
		return ak;
	}
	
	//删除技工
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteByTeamNo(int teamno) {
		int cs = teammap.deleteByTeamNo(teamno);
		return cs;
	}
	
/*	//修改技工
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateByclassNo(int classno) {
		int we = classmap.update(classno);
		return we;
	}*/
}
