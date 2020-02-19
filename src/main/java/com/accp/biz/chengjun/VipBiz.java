package com.accp.biz.chengjun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.chengjun.vipMapper;
import com.accp.pojo.chengjun.vip;

@Service("VipBiz")
public class VipBiz {
@Autowired
 vipMapper dao;

//查看所有类别 
   public List<vip> find(){
	   return dao.selectByPrimaryKey1();

   }
   //新增类别
   public int add(vip record) {
	 return  dao.insertSelective(record);
   }
   //删
   public int remove(String vipid) {
	   return   dao.deleteByPrimaryKey(vipid);
   }
}
