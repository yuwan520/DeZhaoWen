package com.accp.dao;

import com.accp.pojo.team;

public interface teamMapper {
    int insert(team record);

    int insertSelective(team record);
}