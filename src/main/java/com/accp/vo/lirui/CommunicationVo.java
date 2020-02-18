package com.accp.vo.lirui;

public class CommunicationVo {
  
	private String departmentname;
	
	private String empid;
	
	private String empname;
	
	private String emptelephone;
	
	private String empemail;

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

	public String getEmptelephone() {
		return emptelephone;
	}

	public void setEmptelephone(String emptelephone) {
		this.emptelephone = emptelephone;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	@Override
	public String toString() {
		return "communicationVo [departmentname=" + departmentname + ", empid=" + empid + ", empname=" + empname
				+ ", emptelephone=" + emptelephone + ", empemail=" + empemail + "]";
	}

	public CommunicationVo(String departmentname, String empid, String empname, String emptelephone, String empemail) {
		super();
		this.departmentname = departmentname;
		this.empid = empid;
		this.empname = empname;
		this.emptelephone = emptelephone;
		this.empemail = empemail;
	}

	public CommunicationVo() {
		super();
	}
}
