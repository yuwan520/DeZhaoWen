package com.accp.action.chengjun;

import java.util.HashMap;
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

import com.accp.biz.chengjun.VipBiz;
import com.accp.pojo.vehicle;
import com.accp.pojo.vip;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/vip")
public class VipAction {
@Autowired
VipBiz Biz;
@GetMapping("/{pageNum1}")
//查讯所有车
public PageInfo<vip> find(@PathVariable int pageNum1){
	PageHelper.startPage(pageNum1,3);
	 PageInfo<vip> info=new PageInfo<>(Biz.find());
	 return info;
}

 
//新增车辆
@PostMapping("/vips")
public Map<String,String> add(@RequestBody vip mess){
	System.out.println(mess);
	  int js=Biz.add(mess);
	  
	  Map<String,String> map=new HashMap<String, String>();
		if (js>0) {

			map.put("code","200");
		
		}else {
			map.put("code","500");
		}
		return map;
}


//删除车
@DeleteMapping("/vips/{id}")
public Map<String,String> add(@PathVariable String id) {
	 System.out.println(id);
	int js=Biz.remove(id);
	Map<String,String> map=new HashMap<String, String>();
	if (js>0) {

		map.put("code","200");
	
	}else {
		map.put("code","500");
	}
	return map;
}
}
