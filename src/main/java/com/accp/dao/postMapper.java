package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.post;

public interface postMapper {
    int deleteByPrimaryKey(String postid);

    int insert(post record);

    int insertSelective(post record);

    post selectByPrimaryKey(String postid);

    int updateByPrimaryKeySelective(post record);

    int updateByPrimaryKey(post record);
    
    List<post> selectPostList();
    
    int addPost(@Param("record") post record);
    
    
}