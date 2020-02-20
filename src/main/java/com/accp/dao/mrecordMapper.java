package com.accp.dao;


import com.accp.pojo.mrecord;
import com.accp.vo.liutao.vehicleInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface mrecordMapper {

    /**
     * Check if there is an order number on that day
     *
     * @return
     */
    String QueryMrecordNo();

    /**
     * Check to see if there is a pickup vehicle
     *
     * @param carno
     * @return
     */
    List<mrecord> queryPickCar(@Param("carno") String carno);

    /**
     * 竣工查询
     *
     * @return
     */
    List<vehicleInfo> queryAllm();

    /**
     * 竣工验收(简单版)
     *
     * @param eno
     * @return
     */
    int comAccp(@Param("eno") String eno);

}