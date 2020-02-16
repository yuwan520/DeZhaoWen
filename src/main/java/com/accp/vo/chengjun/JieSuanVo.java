package com.accp.vo.chengjun;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class JieSuanVo {
private String rorder;
public JieSuanVo() {
	super();
}
public JieSuanVo(String rorder, String orderType, String status1, String clearing, Date colsing, String jiesuanren,
		String estimated, String businessType, String khname, String wxgroup, String carHno) {
	super();
	this.rorder = rorder;
	this.orderType = orderType;
	this.status1 = status1;
	this.clearing = clearing;
	this.colsing = colsing;
	this.jiesuanren = jiesuanren;
	this.estimated = estimated;
	this.businessType = businessType;
	this.khname = khname;
	this.wxgroup = wxgroup;
	this.carHno = carHno;
}
@Override
public String toString() {
	return "JieSuanVo [rorder=" + rorder + ", orderType=" + orderType + ", status=" + status1 + ", clearing=" + clearing
			+ ", colsing=" + colsing + ", jiesuanren=" + jiesuanren + ", estimated=" + estimated + ", businessType="
			+ businessType + ", khname=" + khname + ", wxgroup=" + wxgroup + ", carHno=" + carHno + "]";
}
private String orderType;
private String status1;
private String clearing;
@JSONField(format = "yyyy-MM-dd")
private Date colsing;
private String jiesuanren;
private String estimated;
private String businessType;
private String khname;
private String wxgroup;
private String carHno;
public String getRorder() {
	return rorder;
}
public void setRorder(String rorder) {
	this.rorder = rorder;
}
public String getOrderType() {
	return orderType;
}
public void setOrderType(String orderType) {
	this.orderType = orderType;
}
public String getStatus() {
	return status1;
}
public void setStatus(String status1) {
	this.status1 = status1;
}
public String getClearing() {
	return clearing;
}
public void setClearing(String clearing) {
	this.clearing = clearing;
}
public Date getColsing() {
	return colsing;
}
public void setColsing(Date colsing) {
	this.colsing = colsing;
}
public String getJiesuanren() {
	return jiesuanren;
}
public void setJiesuanren(String jiesuanren) {
	this.jiesuanren = jiesuanren;
}
public String getEstimated() {
	return estimated;
}
public void setEstimated(String estimated) {
	this.estimated = estimated;
}
public String getBusinessType() {
	return businessType;
}
public void setBusinessType(String businessType) {
	this.businessType = businessType;
}
public String getKhname() {
	return khname;
}
public void setKhname(String khname) {
	this.khname = khname;
}
public String getWxgroup() {
	return wxgroup;
}
public void setWxgroup(String wxgroup) {
	this.wxgroup = wxgroup;
}
public String getCarHno() {
	return carHno;
}
public void setCarHno(String carHno) {
	this.carHno = carHno;
}

}
