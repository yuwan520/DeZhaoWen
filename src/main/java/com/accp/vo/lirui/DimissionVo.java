package com.accp.vo.lirui;

public class DimissionVo {

	private String dimissionid;
	
	private String departmentname;
	
	private String 	empid;
	
	private String empname;
	
	private String empsex;
	
	private String postname;
	
	private String dimissiontime;
	
	private String dimissioncause;

	
	public String getDimissionid() {
		return dimissionid;
	}

	public void setDimissionid(String dimissionid) {
		this.dimissionid = dimissionid;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpsex() {
		return empsex;
	}

	public void setEmpsex(String empsex) {
		this.empsex = empsex;
	}

	public String getPostname() {
		return postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

	public String getDimissiontime() {
		return dimissiontime;
	}

	public void setDimissiontime(String dimissiontime) {
		this.dimissiontime = dimissiontime;
	}

	public String getDimissioncause() {
		return dimissioncause;
	}

	public void setDimissioncause(String dimissioncause) {
		this.dimissioncause = dimissioncause;
	}

	@Override
	public String toString() {
		return "DimissionVo [dimissionid=" + dimissionid + ", departmentname=" + departmentname + ", empid=" + empid
				+ ", empname=" + empname + ", empsex=" + empsex + ", postname=" + postname + ", dimissiontime="
				+ dimissiontime + ", dimissioncause=" + dimissioncause + "]";
	}

	public DimissionVo(String dimissionid, String departmentname, String empid, String empname, String empsex,
			String postname, String dimissiontime, String dimissioncause) {
		super();
		this.dimissionid = dimissionid;
		this.departmentname = departmentname;
		this.empid = empid;
		this.empname = empname;
		this.empsex = empsex;
		this.postname = postname;
		this.dimissiontime = dimissiontime;
		this.dimissioncause = dimissioncause;
	}

	public DimissionVo() {
		super();
	}

	

	

	
}
