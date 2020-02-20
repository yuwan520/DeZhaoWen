package com.accp;

import com.accp.biz.liutao.biz;
import com.accp.dao.*;
import com.accp.dao.liutao.classMapper;
import com.accp.dao.liutao.mrecordMapper;
import com.accp.dao.liutao.pickcarMapper;
import com.accp.dao.liutao.projecttypeMapper;
import com.accp.dao.liutao.vehicleMapper;
import com.accp.pojo.*;
import com.accp.vo.liutao.carInfo;
import com.accp.vo.liutao.minfo;
import com.accp.vo.liutao.vehicleInfo;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;

import java.util.Scanner;

@SpringBootTest
class DeZhaoWenApplicationTests {

	@Autowired
	private vehicleMapper vehicleMapper;

	@Autowired
	private projecttypeMapper projecttypeMapper;

	@Autowired
	private pickcarMapper pickcarMapper;

	@Autowired
	private mrecordMapper mrecordMapper;

	@Autowired
	private classMapper classMapper;


	@Test
	void contextLoads() {
		List<vehicleInfo> vehicleInfos = mrecordMapper.queryAllm();
		System.out.println(JSON.toJSONString(vehicleInfos));

	}

}
