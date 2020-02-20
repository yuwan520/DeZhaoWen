package com.accp.dao.yupengcheng;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.yupengcheng.class1;

public interface classMapper {
	
	List<class1> selectAll();
	
	int delete(@Param("classno") int classno);
	
    int insert(@Param("record") class1 record);
    
    int update(@Param("classno") int classno);

    int insertSelective(class1 record);
}