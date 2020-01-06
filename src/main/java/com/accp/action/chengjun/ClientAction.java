package com.accp.action.chengjun;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.chengjun.ClientBiz;
import com.accp.pojo.client;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/client")
public class ClientAction {
 @Autowired
private ClientBiz Biz;
 @GetMapping("/{pageNum}")
 //查讯所有用户 不查车
 public PageInfo<client> find(@PathVariable int pageNum){
	PageHelper.startPage(pageNum,3);
	 PageInfo<client> info=new PageInfo<>(Biz.find());
	 return info;
 }
 //新增用户 不增车
 @PostMapping("/clients")
 public Map<String,String> add(@RequestBody client xzkh) {
	int js=Biz.add(xzkh);
	Map<String,String> map=new HashMap<String, String>();
	if (js>0) {

		map.put("code","200");
	
	}else {
		map.put("code","500");
	}
	return map;
 }
}
