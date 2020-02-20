package com.accp.biz.chengjun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.chengjun.mrecordMapper1;
import com.accp.vo.chengjun.JieSuanVo;
import com.accp.vo.chengjun.JieSuanVo1;

@Service("MrecordBiz")
public class MrecordBiz {
@Autowired
mrecordMapper1 Dao;

public List<JieSuanVo> find(){
	return Dao.selectByPrimaryKey1();
}

public List<JieSuanVo1> find1(String rorder){
	return Dao.selectByPrimaryKey2(rorder);
}
public int find2(String rorder,String colsing){
	return Dao.updateByPrimaryKey(rorder,colsing);
}
}
