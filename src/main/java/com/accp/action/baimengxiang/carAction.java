package com.accp.action.baimengxiang;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.baimengxiang.datewxbiz;
import com.accp.pojo.datewx;
import com.accp.pojo.maintaininfo;
import com.accp.pojo.pdetails;
import com.accp.vo.baimengxiang.ds;
import com.alibaba.fastjson.JSON;


@RestController
@RequestMapping("/api/emps")
public class carAction {
		@Autowired
		private datewxbiz biz;
		
		@GetMapping
		public List<ds> selectAll(){
			return biz.selectAll();
		}
		
		@PostMapping("datewx")
		public int tianjia(@RequestBody maintaininfo  maintaininfo) {
			return biz.tianjia(maintaininfo);
		}
		@GetMapping("id")
		public String selectid() {
			return biz.selectid();
		}
		
		@GetMapping("lie")
		public List<pdetails> selectlie(){
			return biz.selectlie();
		}
		
		
		public List<maintaininfo>selectyt(String coding){
			return biz.selectyt(coding);
		}
		
			@PostMapping("update/{pid}")
			public int updateDateWx(@RequestBody maintaininfo datewx,@PathVariable String pid) {
				return biz.updateDateWx(datewx, pid);
			}
}
