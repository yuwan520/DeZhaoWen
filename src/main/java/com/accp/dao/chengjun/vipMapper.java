package com.accp.dao.chengjun;

import java.util.List;

import com.accp.pojo.chengjun.vip;

public interface vipMapper {
    int deleteByPrimaryKey(String vipid);

    int insert(vip record);

    int insertSelective(vip record);

    vip selectByPrimaryKey(String vipid);
    List<vip> selectByPrimaryKey1();

    int updateByPrimaryKeySelective(vip record);

    int updateByPrimaryKey(vip record);
}