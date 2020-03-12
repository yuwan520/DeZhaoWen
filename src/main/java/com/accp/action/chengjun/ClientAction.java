package com.accp.action.chengjun;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.chengjun.ClientBiz;
import com.accp.pojo.chengjun.brandcj;
import com.accp.pojo.chengjun.client;
import com.accp.pojo.chengjun.motorcyclecj;
import com.alibaba.fastjson.JSON;
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
	PageHelper.startPage(pageNum,5);
	 PageInfo<client> info=new PageInfo<>(Biz.find());
	 return info;
 }
 @GetMapping("/kh")
 //查讯所有用户 
 public List<client> find3(){
	
	 return Biz.find();
 }
//查讯品牌
 @GetMapping("/pp")
public List<brandcj> find1(){

	 return Biz.find1();
}
//查讯车型
@GetMapping("/cx/{motorcyclepp}")
public List<motorcyclecj> find2(@PathVariable String motorcyclepp){

	 return Biz.find2(motorcyclepp);
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
 
//删除用户  暂时不删除车
@DeleteMapping("/clients/{id}")
public Map<String,String> add(@PathVariable String id) {
	int js=Biz.remove(id);
	Map<String,String> map=new HashMap<String, String>();
	if (js>0) {

		map.put("code","200");
	
	}else {
		map.put("code","500");
	}
	return map;
}
//修改所用到的查询单个
@GetMapping("/clients/{id}")
public client find1(@PathVariable String id){
	
	 return Biz.find1(id);
}
//修改客户
@PutMapping("/clients")
public Map<String,String> update(@RequestBody client dx) {
	System.out.println(JSON.toJSONString(dx));
	int js=Biz.update(dx);
	Map<String,String> map=new HashMap<String, String>();
	if (js>0) {

		map.put("code","200");
	
	}else {
		map.put("code","500");
	}
	return map;
}
}
