package com.accp.biz.yupengcheng;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yupengcheng.carMapper1;
import com.accp.dao.yupengcheng.teamMapper;
import com.accp.pojo.yupengcheng.car;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CarBiz {
	
	@Autowired
	private carMapper1 carmap;
	@Autowired
	private teamMapper teamap;
	
	//分页查询
	public PageInfo<car> queryAll(int num, String bm){
		PageHelper.startPage(num, 4);
		PageInfo<car> page=new PageInfo<>(teamap.selectAll());
		return page;
	}
	
	//删除
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteByNum(String numbercar) {
		int ak=carmap.deleteByNumbercar(numbercar);
		return ak;
	}
	//新增
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertAll(car record) {
		int cs=carmap.insert(record);
		return cs;
	}
}
