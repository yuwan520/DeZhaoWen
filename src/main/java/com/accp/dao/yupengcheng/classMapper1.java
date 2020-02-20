package com.accp.dao.yupengcheng;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.yupengcheng.class11;

public interface classMapper1 {
	
	List<class11> selectAll();
	
	int delete(@Param("classno") int classno);
	
    int insert(@Param("record") class11 record);
    
    int update(@Param("classno") int classno);

    int insertSelective(class11 record);
}