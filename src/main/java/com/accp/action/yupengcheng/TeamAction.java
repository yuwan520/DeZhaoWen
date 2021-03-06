package com.accp.action.yupengcheng;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yupengcheng.TeamBiz;
import com.accp.pojo.yupengcheng.class11;
import com.accp.pojo.yupengcheng.team1;
import com.github.pagehelper.PageInfo;
@RestController
@RequestMapping("api/team")
public class TeamAction {

	@Autowired
	private TeamBiz teambiz;
	
	//查询全部
	@GetMapping("page")
	public PageInfo<team1> getteamByPage(int num,String bm){
		return teambiz.queryAll(num, bm);
	}
	//删除
	@PostMapping("del")
	public String deleteByteamNo(int teamno) {
		int ak=teambiz.deleteByTeamNo(teamno);
		return ak>0?"ok":"fales";
	}
	//新增方法
		@PostMapping("add")
		public String insertAlls(@RequestBody team1 record) {
			/*return classbiz.insertAll(record);*/
			int cs=teambiz.insertAll(record);
			return cs>0?"ok":"false";
		}
		
	//修改方法
		@PostMapping("upd")
		public String updateByTeamno(@RequestBody team1 teams) {
			int we=teambiz.updateByteamNo(teams);
			return we>0?"ok":"false";
		}
		
	//根据teamno查询
		@GetMapping("pages")
		public List<team1> selectAllteamno(int teamno){
			return teambiz.selectAll(teamno);
		}
}
