package com.accp.dao.lirui;

import com.accp.pojo.lirui.shop;

public interface shopMapper {
    int deleteByPrimaryKey(String shopid);

    int insert(shop record);

    int insertSelective(shop record);

    shop selectByPrimaryKey(String shopid);

    int updateByPrimaryKeySelective(shop record);

    int updateByPrimaryKey(shop record);
}