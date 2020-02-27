package com.accp.dao.chengjun;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.chengjun.brandcj;
import com.accp.pojo.chengjun.client;
import com.accp.pojo.chengjun.motorcyclecj;


public interface clientMapper {
    int deleteByPrimaryKey(String clientid);

    int insert(client record);

    int insertSelective(client record);

    client selectByPrimaryKey(String clientid);
    
    List<client> selectByPrimaryKey1();
    List<brandcj> selectByPrimaryKeybrand();
    List<motorcyclecj> selectByPrimaryKeymotorcycle(@Param("motorcyclepp")String motorcyclepp);
    
    int updateByPrimaryKeySelective(client record);

    int updateByPrimaryKey(client record);
}
