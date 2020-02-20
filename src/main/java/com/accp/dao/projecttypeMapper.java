package com.accp.dao;

import com.accp.pojo.projecttype;

import java.util.List;

@SuppressWarnings("ALL")
public interface projecttypeMapper {
    /**
     * Enquiry on maintenance items
     * @return
     */
    List<projecttype> queryProjectType();
}