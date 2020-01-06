package com.accp.biz.chengjun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.clientMapper;
import com.accp.pojo.client;

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
}
