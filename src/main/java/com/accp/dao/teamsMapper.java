package com.accp.dao;

import com.accp.pojo.teams;

public interface teamsMapper {
    int insert(teams record);

    int insertSelective(teams record);
}