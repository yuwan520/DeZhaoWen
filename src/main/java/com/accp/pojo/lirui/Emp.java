package com.accp.pojo.lirui;

import java.util.Date;

public class Emp {
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

    private String shid;

    private String deid;

    private String paid;

    private String poid;

   

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid == null ? null : empid.trim();
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex == null ? null : empsex.trim();
    }

    public String getEmptype() {
        return emptype;
    }

    public void setEmptype(String emptype) {
        this.emptype = emptype == null ? null : emptype.trim();
    }

    public String getEmpcondition() {
        return empcondition;
    }

    public void setEmpcondition(String empcondition) {
        this.empcondition = empcondition == null ? null : empcondition.trim();
    }

    public String getEmpheight() {
        return empheight;
    }

    public void setEmpheight(String empheight) {
        this.empheight = empheight == null ? null : empheight.trim();
    }

    public String getEmpeducation() {
        return empeducation;
    }

    public void setEmpeducation(String empeducation) {
        this.empeducation = empeducation == null ? null : empeducation.trim();
    }

    public String getEmpschool() {
        return empschool;
    }

    public void setEmpschool(String empschool) {
        this.empschool = empschool == null ? null : empschool.trim();
    }

    public String getEmpprofession() {
        return empprofession;
    }

    public void setEmpprofession(String empprofession) {
        this.empprofession = empprofession == null ? null : empprofession.trim();
    }

    public String getEmpcard() {
        return empcard;
    }

    public void setEmpcard(String empcard) {
        this.empcard = empcard == null ? null : empcard.trim();
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress == null ? null : empaddress.trim();
    }

    public String getEmptelephone() {
        return emptelephone;
    }

    public void setEmptelephone(String emptelephone) {
        this.emptelephone = emptelephone == null ? null : emptelephone.trim();
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail == null ? null : empemail.trim();
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
        this.empreferrer = empreferrer == null ? null : empreferrer.trim();
    }

    public String getShid() {
        return shid;
    }

    public void setShid(String shid) {
        this.shid = shid == null ? null : shid.trim();
    }

    public String getDeid() {
        return deid;
    }

    public void setDeid(String deid) {
        this.deid = deid == null ? null : deid.trim();
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid == null ? null : paid.trim();
    }

    public String getPoid() {
        return poid;
    }

    public void setPoid(String poid) {
        this.poid = poid == null ? null : poid.trim();
    }

	public Emp(String empid, String empname, String empsex, String emptype, String empcondition, String empheight,
			String empeducation, String empschool, String empprofession, String empcard, String empaddress,
			String emptelephone, String empemail, Date empentrytime, Date empbirthtime, String empreferrer, String shid,
			String deid, String paid, String poid) {
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
		this.shid = shid;
		this.deid = deid;
		this.paid = paid;
		this.poid = poid;
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", empname=" + empname + ", empsex=" + empsex + ", emptype=" + emptype
				+ ", empcondition=" + empcondition + ", empheight=" + empheight + ", empeducation=" + empeducation
				+ ", empschool=" + empschool + ", empprofession=" + empprofession + ", empcard=" + empcard
				+ ", empaddress=" + empaddress + ", emptelephone=" + emptelephone + ", empemail=" + empemail
				+ ", empentrytime=" + empentrytime + ", empbirthtime=" + empbirthtime + ", empreferrer=" + empreferrer
				+ ", shid=" + shid + ", deid=" + deid + ", paid=" + paid + ", poid=" + poid + "]";
	}

   
}