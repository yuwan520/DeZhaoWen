package com.accp.vo.lirui;

import java.util.Date;

public class EmpVo {

    private String empid;

    private String empname;

    private String empsex;

    private String emptype;

    private String empcondition;

    private String empheight;

    private String empeducation;

    private String empschool;

    private String empprofession;

    private String empcard;

    private String empaddress;

    private String emptelephone;

    private String empemail;

    private Date empentrytime;

    private Date empbirthtime;

    private String empreferrer;

    private String shopname;

    private String departmentname;

    private String payrollname;

    private String postname;

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

	public String getEmptype() {
		return emptype;
	}

	public void setEmptype(String emptype) {
		this.emptype = emptype;
	}

	public String getEmpcondition() {
		return empcondition;
	}

	public void setEmpcondition(String empcondition) {
		this.empcondition = empcondition;
	}

	public String getEmpheight() {
		return empheight;
	}

	public void setEmpheight(String empheight) {
		this.empheight = empheight;
	}

	public String getEmpeducation() {
		return empeducation;
	}

	public void setEmpeducation(String empeducation) {
		this.empeducation = empeducation;
	}

	public String getEmpschool() {
		return empschool;
	}

	public void setEmpschool(String empschool) {
		this.empschool = empschool;
	}

	public String getEmpprofession() {
		return empprofession;
	}

	public void setEmpprofession(String empprofession) {
		this.empprofession = empprofession;
	}

	public String getEmpcard() {
		return empcard;
	}

	public void setEmpcard(String empcard) {
		this.empcard = empcard;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
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

	public Date getEmpentrytime() {
		return empentrytime;
	}

	public void setEmpentrytime(Date empentrytime) {
		this.empentrytime = empentrytime;
	}

	public Date getEmpbirthtime() {
		return empbirthtime;
	}

	public void setEmpbirthtime(Date empbirthtime) {
		this.empbirthtime = empbirthtime;
	}

	public String getEmpreferrer() {
		return empreferrer;
	}

	public void setEmpreferrer(String empreferrer) {
		this.empreferrer = empreferrer;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getPayrollname() {
		return payrollname;
	}

	public void setPayrollname(String payrollname) {
		this.payrollname = payrollname;
	}

	public String getPostname() {
		return postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

	public EmpVo(String empid, String empname, String empsex, String emptype, String empcondition, String empheight,
			String empeducation, String empschool, String empprofession, String empcard, String empaddress,
			String emptelephone, String empemail, Date empentrytime, Date empbirthtime, String empreferrer,
			String shopname, String departmentname, String payrollname, String postname) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsex = empsex;
		this.emptype = emptype;
		this.empcondition = empcondition;
		this.empheight = empheight;
		this.empeducation = empeducation;
		this.empschool = empschool;
		this.empprofession = empprofession;
		this.empcard = empcard;
		this.empaddress = empaddress;
		this.emptelephone = emptelephone;
		this.empemail = empemail;
		this.empentrytime = empentrytime;
		this.empbirthtime = empbirthtime;
		this.empreferrer = empreferrer;
		this.shopname = shopname;
		this.departmentname = departmentname;
		this.payrollname = payrollname;
		this.postname = postname;
	}

	public EmpVo() {
		super();
	}

	@Override
	public String toString() {
		return "EmpVo [empid=" + empid + ", empname=" + empname + ", empsex=" + empsex + ", emptype=" + emptype
				+ ", empcondition=" + empcondition + ", empheight=" + empheight + ", empeducation=" + empeducation
				+ ", empschool=" + empschool + ", empprofession=" + empprofession + ", empcard=" + empcard
				+ ", empaddress=" + empaddress + ", emptelephone=" + emptelephone + ", empemail=" + empemail
				+ ", empentrytime=" + empentrytime + ", empbirthtime=" + empbirthtime + ", empreferrer=" + empreferrer
				+ ", shopname=" + shopname + ", departmentname=" + departmentname + ", payrollname=" + payrollname
				+ ", postname=" + postname + "]";
	}
	
	
}
