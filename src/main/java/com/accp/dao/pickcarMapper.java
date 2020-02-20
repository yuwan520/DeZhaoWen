package com.accp.dao;

import com.accp.pojo.pickcar;
import com.accp.vo.liutao.vehicleInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface pickcarMapper {

    /**
     * Add repair record
     *
     * @param pickcar
     * @return
     */
    int addXcar(@Param("pickcar") pickcar pickcar);


    /**
     * Check vehicle maintenance records
     * @param carNo
     * @param id
     * @return
     */
    List<vehicleInfo> queryVehicleInfo(@Param("carNo") String carNo, @Param("id") String id);

}