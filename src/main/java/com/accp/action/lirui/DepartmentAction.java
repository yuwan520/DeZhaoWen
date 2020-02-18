package com.accp.action.lirui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lirui.DepartmentBiz;
import com.accp.pojo.lirui.department;
import com.accp.vo.lirui.DimissionVo;

@RestController
@RequestMapping("/api/departments")
public class DepartmentAction {
 
	@Autowired
	private DepartmentBiz biz;
	
	@GetMapping()
	public List<department> selectName(){
		
		List<department> list=biz.selectName();
		
		return list;
	}
}
