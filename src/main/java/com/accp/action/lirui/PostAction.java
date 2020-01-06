package com.accp.action.lirui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lirui.PostBiz;
import com.accp.pojo.post;

@RestController
@RequestMapping("/api/posts")
public class PostAction {

	@Autowired
	private PostBiz biz;
	
	/**
	 * 查询所有岗位
	 * */
	@GetMapping()
	public List<post> selectPostList(){
		
		List<post> list=biz.selectPostList();
		return list;
	}
	/**
	 * 添加岗位
	 * */
	@PostMapping("post")
	public Map<String, String> addPost(@RequestBody post record) {
		Map<String, String> message=new HashMap<String, String>();
		biz.addPost(record);
		message.put("code", "200");
		return message;
		
	}
	/**
	 * 删除岗位
	 * */
	@DeleteMapping("post/{postid}")
	public Map<String, String> deletePost(@PathVariable String postid){
		Map<String, String> message=new HashMap<String, String>();
		biz.delete(postid);
		message.put("code", "200");
		return message;
	}
}
