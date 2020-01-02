package com.accp.pojo;

public class bossteam {
    private Integer bossno;

    private String bossname;

    private Integer weight;

    public Integer getBossno() {
        return bossno;
    }

    public void setBossno(Integer bossno) {
        this.bossno = bossno;
    }

    public String getBossname() {
        return bossname;
    }

    public void setBossname(String bossname) {
        this.bossname = bossname == null ? null : bossname.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}