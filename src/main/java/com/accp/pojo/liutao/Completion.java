package com.accp.pojo.liutao;

public class Completion {
    private String eno;

    private Integer qualified;

    private String delays;

    private Integer penatly;

    private String zjperson;

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public Integer getQualified() {
        return qualified;
    }

    public void setQualified(Integer qualified) {
        this.qualified = qualified;
    }

    public String getDelays() {
        return delays;
    }

    public void setDelays(String delays) {
        this.delays = delays;
    }

    public Integer getPenatly() {
        return penatly;
    }

    public void setPenatly(Integer penatly) {
        this.penatly = penatly;
    }

    public String getZjperson() {
        return zjperson;
    }

    public void setZjperson(String zjperson) {
        this.zjperson = zjperson;
    }

    public Completion(String eno, Integer qualified, String delays, Integer penatly, String zjperson) {
        this.eno = eno;
        this.qualified = qualified;
        this.delays = delays;
        this.penatly = penatly;
        this.zjperson = zjperson;
    }

    public Completion() {
    }
}