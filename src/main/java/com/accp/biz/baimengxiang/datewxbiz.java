package com.accp.biz.baimengxiang;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.bmx.datewxMapper;
import com.accp.pojo.bmx.datewx;
import com.accp.pojo.bmx.maintaininfo;
import com.accp.pojo.bmx.pdetails;
import com.accp.vo.baimengxiang.ds;
@Service
public class datewxbiz {
		
	@Autowired
	private  datewxMapper wx;
	
	public List<ds> selectAll(){
		 return wx.selectAll();
		}
	public int tianjia(maintaininfo maintaininfo) {
		return wx.savePerson(maintaininfo);
				}

	public String selectid() {
		return wx.selectid();
	}
	
	public List<pdetails> selectlie(){
		return wx.selectlie();
	}
	
	
	public List<maintaininfo> selectyt(String coding){
		return wx.selectyt(coding);
	}
	
	public int updateDateWx(maintaininfo datewx,int pid) {
		return wx.updateDateWx(datewx, pid);
	}
	
public List<maintaininfo> selectByprojectChild(String projectChild){
	return wx.selectByprojectChild(projectChild);
}
public int deleteid(int coding) {
	return wx.deleteid(coding);
}

}
