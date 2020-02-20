package com.accp.dao;

import com.accp.pojo.maintaininfo;
import com.accp.pojo.projecttype;
import com.accp.pojo.vehicle;
import com.accp.vo.liutao.carInfo;
import com.accp.vo.liutao.minfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface vehicleMapper {

    /**
     * Check all license plate Numbers
     *
     * @return
     */
    List<vehicle> queryCarNo();

    /**
     * Query vehicle customer information
     *
     * @return
     */
    List<carInfo> queryCarInfo(@Param("carno") String carno);

    /**
     * Search for pickup information
     *
     * @return
     */
    List<carInfo> queryPickInfo(@Param("carno") String carno);

    /**
     * Inquire for details of maintenance items
     *
     * @param pno
     * @return
     */
    List<minfo> queryMainInfoBypno(@Param("pno") String pno);

    /**
     * Fuzzy search license plate information
     * @param Vtext
     * @return
     */
    List<vehicle> queryVehiclecp(@Param("Vtext") String Vtext);


}