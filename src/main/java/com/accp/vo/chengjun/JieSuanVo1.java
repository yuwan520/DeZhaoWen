package com.accp.vo.chengjun;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class JieSuanVo1 {
private String xmName;
private String wxgroup;
private String classname;
private String manHour;

private Date orderTime;
private String carHno;

private String rorder;
private String clientname;
private String vipjglx;
private String viplb;
private String estimated;
public String getClientname() {
	return clientname;
}
public void setClientname(String clientname) {
	this.clientname = clientname;
}
public String getVipjglx() {
	return vipjglx;
}
public void setVipjglx(String vipjglx) {
	this.vipjglx = vipjglx;
}
public String getViplb() {
	return viplb;
}
public void setViplb(String viplb) {
	this.viplb = viplb;
}
public String getEstimated() {
	return estimated;
}
public void setEstimated(String estimated) {
	this.estimated = estimated;
}
public JieSuanVo1() {
	super();
}

@Override
public String toString() {
	return "JieSuanVo1 [xmName=" + xmName + ", wxgroup=" + wxgroup + ", classname=" + classname + ", manHour=" + manHour
			+ ", orderTime=" + orderTime + ", carHno=" + carHno + ", rorder=" + rorder + ", clientname=" + clientname
			+ ", vipjglx=" + vipjglx + ", viplb=" + viplb + ", estimated=" + estimated + "]";
}

public JieSuanVo1(String xmName, String wxgroup, String classname, String manHour, Date orderTime, String carHno,
		String rorder, String clientname, String vipjglx, String viplb, String estimated) {
	super();
	this.xmName = xmName;
	this.wxgroup = wxgroup;
	this.classname = classname;
	this.manHour = manHour;
	this.orderTime = orderTime;
	this.carHno = carHno;
	this.rorder = rorder;
	this.clientname = clientname;
	this.vipjglx = vipjglx;
	this.viplb = viplb;
	this.estimated = estimated;
}
public String getXmName() {
	return xmName;
}
public void setXmName(String xmName) {
	this.xmName = xmName;
}
public String getWxgroup() {
	return wxgroup;
}
public void setWxgroup(String wxgroup) {
	this.wxgroup = wxgroup;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}
public String getManHour() {
	return manHour;
}
public void setManHour(String manHour) {
	this.manHour = manHour;
}
public Date getOrderTime() {
	return orderTime;
}
public void setOrderTime(Date orderTime) {
	this.orderTime = orderTime;
}
public String getCarHno() {
	return carHno;
}
public void setCarHno(String carHno) {
	this.carHno = carHno;
}
public String getRorder() {
	return rorder;
}
public void setRorder(String rorder) {
	this.rorder = rorder;
}

}
