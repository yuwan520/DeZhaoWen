package com.accp.biz.lirui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lirui.departmentMapper;
import com.accp.pojo.lirui.department;

@Service("DepartmentBiz")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class DepartmentBiz {

	@Autowired
	private departmentMapper biz;
	
	public List<department> selectName(){
		List<department> list=biz.selectName();
		return list;
	}
}
