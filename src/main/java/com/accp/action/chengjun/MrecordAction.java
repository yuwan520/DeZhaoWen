package com.accp.action.chengjun;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.chengjun.MrecordBiz;
import com.accp.vo.chengjun.JieSuanVo;
import com.accp.vo.chengjun.JieSuanVo1;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/m")
	public class MrecordAction {
	@Autowired
	 MrecordBiz Biz;

	@GetMapping("/{pageNum}")
	public PageInfo<JieSuanVo> find(@PathVariable int pageNum) {
		PageHelper.startPage(pageNum, 3);
		PageInfo<JieSuanVo> info = new PageInfo<>(Biz.find());
		return info;
	}
	@GetMapping("/ms/{dh}")
	public List<JieSuanVo1> find1(@PathVariable String dh) {
		
		return Biz.find1(dh);
	}
	@GetMapping("/mss/{dh}")
	public int find2(@PathVariable String dh) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		return Biz.find2(dh,df.format(new Date()));
	}
}
