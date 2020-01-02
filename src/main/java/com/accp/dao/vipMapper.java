package com.accp.dao;

import com.accp.pojo.vip;

public interface vipMapper {
    int deleteByPrimaryKey(String vipid);

    int insert(vip record);

    int insertSelective(vip record);

    vip selectByPrimaryKey(String vipid);

    int updateByPrimaryKeySelective(vip record);

    int updateByPrimaryKey(vip record);
}