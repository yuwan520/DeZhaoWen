package com.accp.biz.lirui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lirui.postMapper;
import com.accp.pojo.lirui.post;

@Service("PostBiz")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PostBiz {

	@Autowired
	private postMapper biz;
	
	/**
	 * 查询所有岗位
	 * @return
	 */
	public List<post> selectPostList(){
		
		List<post> list=biz.selectPostList();
		return list;
	}
	/**
	 * 添加岗位
	 * */
	public void addPost(post record) {
		
		biz.addPost(record);
	}
	/**
	 * 删除岗位
	 * */
	public void delete(String postid) {
		biz.deleteByPrimaryKey(postid);
		
	}
	/**
	 * 查询id
	 * */
	public post selectPostID(String postid){
		post  list=biz.selectPostId(postid);
		return list;
		
	}
	public void updatePost(post record) {
		
		biz.updatePost(record);
	}
	
}
