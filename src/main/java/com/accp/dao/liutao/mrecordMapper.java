package com.accp.dao.liutao;


import com.accp.pojo.liutao.Completion;
import com.accp.pojo.liutao.mrecord;
import com.accp.vo.liutao.cominfo;
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
     * 竣工信息查询
     *
     * @param cominfo
     * @return
     */
    List<vehicleInfo> queryAllm(@Param("cominfo") cominfo cominfo);

    /**
     *
     *竣工修改状态
     * @param eno
     * @return
     */
    int comAccp(@Param("eno") String eno);

    /**
     * 竣工验收(高级版)
     * @param completion
     * @return
     */
    int completion(@Param("completion") Completion completion);

}