package com.accp;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.dao.bmx.datewxMapper;
import com.accp.pojo.bmx.datewx;
import com.accp.pojo.bmx.maintaininfo;
import com.alibaba.fastjson.JSON;

@SpringBootTest
class DeZhaoWenApplicationTests {

	@Autowired
	private  datewxMapper wx;
	@Test
	void contextLoads() {
	
		System.out.println(JSON.toJSONString(wx.selectByprojectChild("刹车片")));
		
	
	}

}
