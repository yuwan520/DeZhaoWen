package com.accp.pojo.yupengcheng;

import java.util.List;

public class team1 {
    private Integer teamno;

    private String teamname;

    private String number;

    private String artname;

    private String sex;

    private Integer phone;

    private String site;

    private String logname;

    private String idcard;

    private Integer classno;

    private String typeg;

    private String brands;
    

	public Integer getTeamno() {
        return teamno;
    }

    public void setTeamno(Integer teamno) {
        this.teamno = teamno;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getArtname() {
        return artname;
    }

    public void setArtname(String artname) {
        this.artname = artname == null ? null : artname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname == null ? null : logname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Integer getClassno() {
        return classno;
    }

    public void setClassno(Integer classno) {
        this.classno = classno;
    }

    public String getTypeg() {
        return typeg;
    }

    public void setTypeg(String typeg) {
        this.typeg = typeg == null ? null : typeg.trim();
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands == null ? null : brands.trim();
    }
}