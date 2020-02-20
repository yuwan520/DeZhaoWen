package com.accp.dao;

import com.accp.pojo.class1;

import java.util.List;

public interface classMapper {
    int insert(class1 record);

    int insertSelective(class1 record);

    /**
     * Inquire maintenance technician information
     * @return
     */
    List<class1> queryArtisan();
}