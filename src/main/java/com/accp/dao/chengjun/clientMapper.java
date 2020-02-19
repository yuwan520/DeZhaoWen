package com.accp.dao.chengjun;

import java.util.List;

import com.accp.pojo.chengjun.client;


public interface clientMapper {
    int deleteByPrimaryKey(String clientid);

    int insert(client record);

    int insertSelective(client record);

    client selectByPrimaryKey(String clientid);
   List<client> selectByPrimaryKey1();

    int updateByPrimaryKeySelective(client record);

    int updateByPrimaryKey(client record);
}
