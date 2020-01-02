package com.accp.dao;

import com.accp.pojo.bossteam;

public interface bossteamMapper {
    int deleteByPrimaryKey(Integer bossno);

    int insert(bossteam record);

    int insertSelective(bossteam record);

    bossteam selectByPrimaryKey(Integer bossno);

    int updateByPrimaryKeySelective(bossteam record);

    int updateByPrimaryKey(bossteam record);
}