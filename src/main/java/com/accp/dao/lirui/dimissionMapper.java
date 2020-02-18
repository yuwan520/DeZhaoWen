package com.accp.dao.lirui;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.dimission;
import com.accp.pojo.employee;
import com.accp.pojo.post;
import com.accp.pojo.lirui.Dimss;
import com.accp.pojo.lirui.Emp;
import com.accp.vo.lirui.DimissionVo;
import com.accp.vo.lirui.EmpVo;
import com.accp.vo.lirui.CommunicationVo;

public interface dimissionMapper {
    int deleteByPrimaryKey(String dimissionid);

    int insert(dimission record);

    int insertSelective(dimission record);

    dimission selectByPrimaryKey(String dimissionid);

    int updateByPrimaryKeySelective(dimission record);

    int updateByPrimaryKey(dimission record);
    
    List<DimissionVo> selectDimissionVo(@Param("empname") String empname);
    
    List<DimissionVo> selectDimissionVoo();
    
    List<Emp> selectEmpName();
    
    int addDimission(@Param("record") Dimss record);
    
    EmpVo selectEmpId(@Param("empid") String empid);
    
    int deleteEmpId(@Param("empid") String empid);
    
    int deleteDimissionId(@Param("empid") String empid);
    
    List<CommunicationVo> selectCommunication(@Param("empname") String empname);
    
    List<CommunicationVo> selectCommun();
    
    CommunicationVo selectById(@Param("empid") String empid);
    
    int updateEmp( Emp emp);
}