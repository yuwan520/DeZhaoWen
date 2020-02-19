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

import com.accp.biz.lirui.DimissionVoBiz;

import com.accp.pojo.lirui.dimission;
import com.accp.pojo.lirui.employee;
import com.accp.pojo.lirui.Dimss;
import com.accp.pojo.lirui.Emp;
import com.accp.pojo.lirui.post;
import com.accp.vo.lirui.CommunicationVo;
import com.accp.vo.lirui.DimissionVo;
import com.accp.vo.lirui.EmpVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/dimissions")
public class DimissionAction {

	@Autowired
	private DimissionVoBiz biz;
	
	/**
	 * 查询离职
	 */
	@GetMapping("dim/{p}/{s}/{empname}")
	public PageInfo<DimissionVo> selectAll(@PathVariable Integer p,@PathVariable Integer s,@PathVariable String empname){
		
		
		
		return biz.selectDimissionVo(p, s, empname);
	}
	@GetMapping("dim/{p}/{s}")
	public PageInfo<DimissionVo> selectAll(@PathVariable Integer p,@PathVariable Integer s){
		
		
		
		return biz.selectDimissionVoo(p, s);
	}
	/**
	 * 查询员工姓名
	 */
	@GetMapping("dimission")
	public List<Emp> selectEmpName(){
		List<Emp> list=biz.selectEmpName();
		return list;
	}
	/**
	 * 添加离职
	 */
	@PostMapping("dimission")
	public Map<String, String> addDimission(@RequestBody Dimss record) {
		Map<String, String> message=new HashMap<String, String>();
		biz.addDimission(record);
		message.put("code", "200");
		return message;
		
	}
	/**
	 * 查询id
	 */
	@GetMapping("dimission/{empid}")
	public EmpVo selectEmpId(@PathVariable String empid) {
		EmpVo emp=biz.selectEmpId(empid);
				return emp;
	}
	/**
	 * 删除员工
	 */
	@DeleteMapping("dimission/{empid}")
	public Map<String, String> deleteEmpid(@PathVariable String empid) {
		Map<String, String> message=new HashMap<String, String>();
		int count=biz.deleteEmpId(empid);
		message.put("code", "200");
		return message;
		
	}
	/**
	 * 回滚员工
	 */
	@DeleteMapping("dimi/{empid}")
	public Map<String, String> deleteDimissionId(@PathVariable String empid) {
		Map<String, String> message=new HashMap<String, String>();
		int count=biz.deleteDimissionId(empid);
		message.put("code", "200");
		return message;
		
	}
	/**
	 * 查询所有通讯
	 */
	@GetMapping("commun/{p}/{s}/{empname}")
	public PageInfo<CommunicationVo> selectCommunicationVo(@PathVariable Integer p,@PathVariable Integer s,@PathVariable String empname){
		System.out.println("进来了");
			return biz.selectCommunicationVo(p, s, empname);
	}
	
	@GetMapping("commun/{p}/{s}")
	public PageInfo<CommunicationVo> selectCommun(@PathVariable Integer p,@PathVariable Integer s){
		
			return biz.selectCommun(p,s);
	}
	
	/**
	 * 查询单个id
	 */
	@GetMapping("com/{empid}")
	public CommunicationVo selectById(@PathVariable String empid){
		System.out.println("3242");
		CommunicationVo com=biz.selectById(empid);
			return com;
	}
	/**
	 * 修改
	 *
	 */
	 	@PutMapping("di")
		public Map<String, String> updateEmp(@RequestBody Emp emp){
			System.out.println("修改进来了");
			Map<String, String> message=new HashMap<String,String>();
			biz.updateEmp(emp);
			message.put("code", "200");
			message.put("msg", "ok");
			return message;
		}
	
	
}
