package com.accp.pojo.chengjun;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Function {

	private Integer fid;
	private String fcode;
	private String fname;
	@JSONField(format = "yyyy-MM-dd")
	private Date createdate;
	
	private Function parentFun;// 父对象

	public Function getParentFun() {
		return parentFun;
	}

	public void setParentFun(Function parentFun) {
		this.parentFun = parentFun;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

}