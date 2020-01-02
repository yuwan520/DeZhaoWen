package com.accp.dao;

import com.accp.pojo.car;

public interface carMapper {
    int insert(car record);

    int insertSelective(car record);
}