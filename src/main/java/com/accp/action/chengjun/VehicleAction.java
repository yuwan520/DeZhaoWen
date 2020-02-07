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
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.chengjun.VehicleBiz;
import com.accp.pojo.client;
import com.accp.pojo.vehicle;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/ve")
public class VehicleAction {
  @Autowired
  VehicleBiz Biz;
    
 
  @GetMapping("/{pageNum}")
  //查讯所有车
  public PageInfo<vehicle> find(@PathVariable int pageNum){
 	PageHelper.startPage(pageNum,3);
 	 PageInfo<vehicle> info=new PageInfo<>(Biz.find());
 	 return info;
  }
  @GetMapping("/ves/{pageNum}/{name}")
  //查讯用户的车
  public PageInfo<vehicle> find(@PathVariable int pageNum, @PathVariable  String name){
	  PageHelper.startPage(pageNum,3);
	 	 PageInfo<vehicle> info=new PageInfo<>(Biz.find3(name));
 	return info;
  }
   
  //新增车辆
  @PostMapping("/vehicles")
  public Map<String,String> add(@RequestBody vehicle xzcl){
	  int js=Biz.add(xzcl);
	  
	  Map<String,String> map=new HashMap<String, String>();
		if (js>0) {

			map.put("code","200");
		
		}else {
			map.put("code","500");
		}
		return map;
  }
  //查询需要修改车辆
  @GetMapping("/vehicles/{cp}")
  public vehicle find1(@PathVariable String cp){
	  System.out.println(cp);
	return Biz.find1(cp);
  }
//修改客户
@PutMapping("/vehicles")
public Map<String,String> update(@RequestBody vehicle xzcl) {
	int js=Biz.xg(xzcl);
	Map<String,String> map=new HashMap<String, String>();
	if (js>0) {

		map.put("code","200");
	
	}else {
		map.put("code","500");
	}
	return map;
}
  

//删除车
@DeleteMapping("/vehicles/{cp}")
public Map<String,String> add(@PathVariable String cp) {
	 System.out.println(cp);
	int js=Biz.remove(cp);
	Map<String,String> map=new HashMap<String, String>();
	if (js>0) {

		map.put("code","200");
	
	}else {
		map.put("code","500");
	}
	return map;
}

}
