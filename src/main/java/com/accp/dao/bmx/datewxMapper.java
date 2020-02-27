package com.accp.dao.bmx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.bmx.datewx;
import com.accp.pojo.bmx.maintaininfo;
import com.accp.pojo.bmx.pdetails;
import com.accp.vo.baimengxiang.ds;

public interface datewxMapper {
   
   List<ds> selectAll();
   /**
    *新增
    * @param maintaininfo
    * @return
    */
 int savePerson(@Param("datewx") maintaininfo maintaininfo);
 
String selectid();
List<pdetails> selectlie();
 
 
 
/**
 * 修改
 * @param projectid
 * @return
 */
 List<maintaininfo> selectyt(@Param("coding")String coding);
 
 
/**
 * 修改维修项目
 * @param datewx
 * @param pid
 * @return
 */
 int updateDateWx(@Param("wx")maintaininfo datewx,@Param("pid")int pid);
 

 /**
  * 
  * 查询BYprojectChild
  */
 List<maintaininfo> selectByprojectChild(@Param("projectChild")String projectChild);
 
 
 int deleteid(@Param("coding")int coding);
}
