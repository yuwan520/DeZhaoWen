package com.accp.dao.chengjun;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.chengjun.mrecord1;
import com.accp.vo.chengjun.JieSuanVo;
import com.accp.vo.chengjun.JieSuanVo1;

public interface mrecordMapper1 {
    int deleteByPrimaryKey(String carhno);

    int insert(mrecord1 record);

    int insertSelective(mrecord1 record);

    mrecord1 selectByPrimaryKey(String carhno);
    List<JieSuanVo> selectByPrimaryKey1();
    List<JieSuanVo1> selectByPrimaryKey2(@Param("rorder") String rorder);
    int updateByPrimaryKeySelective(mrecord1 record);

    int updateByPrimaryKey(@Param("rorder")String rorder,@Param("colsing")String colsing);
}