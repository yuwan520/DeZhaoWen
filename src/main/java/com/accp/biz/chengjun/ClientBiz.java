package com.accp.biz.chengjun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.chengjun.clientMapper;
import com.accp.pojo.chengjun.brandcj;
import com.accp.pojo.chengjun.client;
import com.accp.pojo.chengjun.motorcyclecj;

@Service("ClientBiz")
public class ClientBiz {
    @Autowired
    clientMapper Dao;
    //查询所有用户不查车
    public List<client> find(){
    	return Dao.selectByPrimaryKey1();
    			}
    //新增用户不新增车
    public int add(client record) {
    	return Dao.insertSelective(record);	
    }
    //删除用户  要同时删除他的车 我暂时还没有删除他的车
    public int remove(String clientid) {
    	return Dao.deleteByPrimaryKey(clientid);
    }
    //修改所用到的查询单个
    public client find1(String clientid){
    	return Dao.selectByPrimaryKey(clientid);
    			}
  //修改客户
    public int update(client record){
    	return Dao.updateByPrimaryKeySelective(record);
    			}
    //查询品牌
    public List<brandcj> find1(){
    	return Dao.selectByPrimaryKeybrand();
    			}
    //查询车型
    public List<motorcyclecj> find2(String motorcyclepp){
    	return Dao.selectByPrimaryKeymotorcycle(motorcyclepp);
    			}
    
    
}
