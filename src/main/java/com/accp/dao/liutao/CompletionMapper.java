package com.accp.dao.liutao;

import com.accp.pojo.liutao.Completion;
import org.apache.ibatis.annotations.Param;

public interface CompletionMapper {

    //查询返工次数，如果有
    String queryReWork(@Param("eno") String eno);

    //返工修改+1
    int updateQualified(@Param("eno") String eno);

    //返工后合格,修改为0且修改状态
    int updateHgQualified(@Param("eno") String eno);

}