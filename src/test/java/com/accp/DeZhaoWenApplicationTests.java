package com.accp;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.dao.datewxMapper;
import com.accp.pojo.datewx;
import com.accp.pojo.maintaininfo;
import com.alibaba.fastjson.JSON;

@SpringBootTest
class DeZhaoWenApplicationTests {

	@Autowired
	private  datewxMapper wx;
	@Test
	void contextLoads() {
	
		System.out.println(wx.selectlie());
	}

}
