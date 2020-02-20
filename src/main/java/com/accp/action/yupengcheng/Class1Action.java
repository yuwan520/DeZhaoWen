package com.accp.action.yupengcheng;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yupengcheng.classBiz;
import com.accp.pojo.yupengcheng.car;
import com.accp.pojo.yupengcheng.class11;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/class1")
public class Class1Action {

	@Autowired
	private classBiz classbiz;
	
	//查新全部
	@GetMapping("page")
	public PageInfo<class11> getcarByPage(int num,String bm){
		return classbiz.queryAll(num, bm);
	}
	
	//删除方法
	@PostMapping("del")
	public String deleteAlls(int classno) {
		/*return classbiz.deleteByClassNo(classno);*/
		int ak=classbiz.deleteByClassNo(classno);
		return ak>0?"ok":"false";
	}
	
	//新增方法
	@PostMapping("add")
	public String insertAlls(@RequestBody class11 record) {
		/*return classbiz.insertAll(record);*/
		int cs=classbiz.insertAll(record);
		return cs>0?"ok":"false";
	}
	
/*	//修改方法
	@PostMapping("upd")
	public String updateAlls(int classno) {
		
	}*/
}
