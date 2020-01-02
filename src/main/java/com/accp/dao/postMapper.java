package com.accp.dao;

import com.accp.pojo.post;

public interface postMapper {
    int deleteByPrimaryKey(String postid);

    int insert(post record);

    int insertSelective(post record);

    post selectByPrimaryKey(String postid);

    int updateByPrimaryKeySelective(post record);

    int updateByPrimaryKey(post record);
}