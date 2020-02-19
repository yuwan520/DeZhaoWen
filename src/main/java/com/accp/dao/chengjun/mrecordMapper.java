package com.accp.dao.chengjun;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.chengjun.mrecord;
import com.accp.vo.chengjun.JieSuanVo;
import com.accp.vo.chengjun.JieSuanVo1;

public interface mrecordMapper {
    int deleteByPrimaryKey(String carhno);

    int insert(mrecord record);

    int insertSelective(mrecord record);

    mrecord selectByPrimaryKey(String carhno);
    List<JieSuanVo> selectByPrimaryKey1();
    List<JieSuanVo1> selectByPrimaryKey2(@Param("rorder") String rorder);
    int updateByPrimaryKeySelective(mrecord record);

    int updateByPrimaryKey(@Param("rorder")String rorder,@Param("colsing")String colsing);
}