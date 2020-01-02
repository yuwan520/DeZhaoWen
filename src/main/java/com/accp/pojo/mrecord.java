package com.accp.pojo;

import java.util.Date;

public class mrecord {
    private String carhno;

    private String status1;

    private String btype;

    private String rorder;

    private String ordertype;

    private Date ordertime;

    private String colsing;

    public String getCarhno() {
        return carhno;
    }

    public void setCarhno(String carhno) {
        this.carhno = carhno == null ? null : carhno.trim();
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1 == null ? null : status1.trim();
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype == null ? null : btype.trim();
    }

    public String getRorder() {
        return rorder;
    }

    public void setRorder(String rorder) {
        this.rorder = rorder == null ? null : rorder.trim();
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getColsing() {
        return colsing;
    }

    public void setColsing(String colsing) {
        this.colsing = colsing == null ? null : colsing.trim();
    }
}