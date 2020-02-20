package com.accp.dao.liutao;

import java.util.List;

import com.accp.pojo.liutao.projecttype;

@SuppressWarnings("ALL")
public interface projecttypeMapper {
    /**
     * Enquiry on maintenance items
     * @return
     */
    List<projecttype> queryProjectType();
}