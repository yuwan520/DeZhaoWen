package com.accp.action.lirui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lirui.EmployeeBiz;
import com.accp.pojo.lirui.Emp;
import com.accp.pojo.lirui.department;
import com.accp.pojo.lirui.payroll;
import com.accp.pojo.lirui.post;
import com.accp.pojo.lirui.shop;
import com.accp.vo.lirui.CommunicationVo;
import com.accp.vo.lirui.EmpVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/employees")
public class EmployeeAction {

	@Autowired
	private EmployeeBiz biz;
	
	@GetMapping("employee/{p}/{s}/{empname}")
	public PageInfo<EmpVo> selectEmpNameId(@PathVariable Integer p,@PathVariable Integer s,@PathVariable String empname){
		
			return biz.selectEmpNameId(p, s, empname);
	}
	@GetMapping("employee/{p}/{s}")
	public PageInfo<EmpVo> selectEmpAll(@PathVariable Integer p,@PathVariable Integer s){
		
			return biz.selectEmpAll(p, s);
	}
	@GetMapping("employeee/{p}/{s}/{departmentid}")
	public PageInfo<EmpVo> selectDepartmentName(@PathVariable Integer p,@PathVariable Integer s,@PathVariable String departmentid){
		
			return biz.selectDepartmentName(p, s, departmentid);
					
	}
	//赋值门店
	@GetMapping("shop")
	public List<shop> selectShop(){
		List<shop> list=biz.selectShop();
		return list;
	}
	//赋值计薪
	@GetMapping("payroll")
	public List<payroll> selectPayroll(){
		List<payroll> list=biz.selectPayroll();
		return list;
	}
	//赋值岗位
	@GetMapping("post")
	public List<post> selectPost(){
		List<post> list=biz.selectPost();
		return list;
	}
	//赋值部门
	@GetMapping("department")
	public List<department> selectDepartment(){
		List<department> list=biz.selectDepartment();
		return list;
	}
	@PostMapping("emp")
	public Map<String, String> addEmp(@RequestBody Emp emp) {
		Map<String, String> message=new HashMap<String, String>();
		biz.addEmp(emp);
		message.put("code", "200");
		return message;
		
	}
	//删除员工
	@DeleteMapping("emp/{empid}")
	public Map<String, String> deleteEmpId(@PathVariable String empid) {
		System.out.println("进来了");
		Map<String, String> message=new HashMap<String, String>();
		int count=biz.deleteEmpID(empid);
		message.put("code", "200");
		return message;
		
	}
	//修改查询id
	@GetMapping("emp/{empid}")
	public List<Emp> selectEmpId(@PathVariable String empid){
		List<Emp> list=biz.selectId(empid);
		return list;
	}
	//修改
	@PutMapping(value = "empp",produces = "application/json;utf-8")
	public Map<String, String> updateEmployee(@RequestBody Emp empp) {
	
		Map<String, String> message=new HashMap<String, String>();
		biz.updateEmployee(empp);
		message.put("code", "200");
		return message;
		
	}
	
}
