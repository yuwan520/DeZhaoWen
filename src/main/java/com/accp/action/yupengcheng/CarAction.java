package com.accp.action.yupengcheng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yupengcheng.CarBiz;
import com.accp.pojo.yupengcheng.car;
import com.accp.pojo.yupengcheng.team1;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/cars")
public class CarAction {
	
	@Autowired
	private CarBiz carb;
	
	
	@GetMapping("page")
	public PageInfo<car> getcarByPage(int num,String bm){
		return carb.queryAll(num, bm);
	}
	
	/*@PostMapping("dele")
	public int deleteByNumbercar(String numbercar) {
		int ak=carb.deleteByNum(numbercar);
		return ak;
	}*/
	
	//删除
	@PostMapping("dele")
	public String deleteByNumbercar(String carno) {
		int c=carb.deleteByNum(carno);
		return c>0?"ok":"false";
	}
	//新增
	@PostMapping("insert")
	public String insertCarAll(@RequestBody car record) {
		int cs=carb.insertAll(record);
		return cs>0?"ok":"false";
	}
}
