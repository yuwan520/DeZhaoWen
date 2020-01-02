package com.accp.dao;

import com.accp.pojo.affiliation;

public interface affiliationMapper {
    int deleteByPrimaryKey(String affiliationid);

    int insert(affiliation record);

    int insertSelective(affiliation record);

    affiliation selectByPrimaryKey(String affiliationid);

    int updateByPrimaryKeySelective(affiliation record);

    int updateByPrimaryKey(affiliation record);
}