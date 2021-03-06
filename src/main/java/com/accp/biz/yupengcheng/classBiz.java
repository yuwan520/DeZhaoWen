package com.accp.biz.yupengcheng;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.yupengcheng.classMapper1;
import com.accp.pojo.yupengcheng.car;
import com.accp.pojo.yupengcheng.class11;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class classBiz {

	@Autowired
	private classMapper1 classmap;

	// 分页查询
	public PageInfo<class11> queryAll(int num, String bm) {
		PageHelper.startPage(num, 4);
		PageInfo<class11> page = new PageInfo<>(classmap.selectAll());
		return page;
	}

	// 新增星级
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertAll(class11 record) {
		int ak = classmap.insert(record);
		return ak;
	}

	// 删除星级
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteByClassNo(int classno) {
		int cs = classmap.delete(classno);
		return cs;
	}

	// 修改星级
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateByclassNo(int classno) {
		int we = classmap.update(classno);
		return we;
	}
}
