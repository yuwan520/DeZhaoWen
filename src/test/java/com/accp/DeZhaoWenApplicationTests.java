package com.accp;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

<<<<<<< HEAD
import com.accp.biz.lirui.DimissionVoBiz;
import com.accp.vo.lirui.DimissionVo;
=======
import com.accp.dao.yupengcheng.teamMapper;
import com.alibaba.fastjson.JSON;
>>>>>>> ypc

@SpringBootTest
class DeZhaoWenApplicationTests {

<<<<<<< HEAD
	
	
	@Test
	void contextLoads() {
		
=======
	@Autowired
	private teamMapper teams;
	
	@Test
	void contextLoads() {
		System.out.println(JSON.toJSONString(teams.selectAll()));
>>>>>>> ypc
	}

}
