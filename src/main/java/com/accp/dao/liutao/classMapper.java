package com.accp.dao.liutao;

import java.util.List;

import com.accp.pojo.liutao.class1;

public interface classMapper {
    int insert(class1 record);

    int insertSelective(class1 record);

    /**
     * Inquire maintenance technician information
     * @return
     */
    List<class1> queryArtisan();
}