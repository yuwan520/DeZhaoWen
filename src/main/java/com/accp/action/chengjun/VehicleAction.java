package com.accp.action.chengjun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
  //查讯所有用户 不查车
  public PageInfo<vehicle> find(@PathVariable int pageNum){
 	PageHelper.startPage(pageNum,3);
 	 PageInfo<vehicle> info=new PageInfo<>(Biz.find());
 	 return info;
  }
}
