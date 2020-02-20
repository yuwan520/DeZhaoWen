package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.dao.yupengcheng.teamMapper;
import com.alibaba.fastjson.JSON;

@SpringBootTest
class DeZhaoWenApplicationTests {

	@Autowired
	private teamMapper teams;
	
	@Test
	void contextLoads() {
		System.out.println(JSON.toJSONString(teams.selectAll()));
	}

}
