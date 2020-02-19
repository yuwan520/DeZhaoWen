package com.accp.biz.yupengcheng;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.classMapper;
import com.accp.pojo.car;
import com.accp.pojo.class1;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class classBiz {

	@Autowired
	private classMapper classmap;

	// 分页查询
	public PageInfo<class1> queryAll(int num, String bm) {
		PageHelper.startPage(num, 4);
		PageInfo<class1> page = new PageInfo<>(classmap.selectAll());
		return page;
	}

	// 新增星级
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertAll(class1 record) {
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
