package com.accp.dao;

import com.accp.pojo.datewx;

public interface datewxMapper {
    int insert(datewx record);

    int insertSelective(datewx record);
}