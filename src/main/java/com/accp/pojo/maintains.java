package com.accp.pojo;

public class maintains {
    private String wxorders;

    private String xmname;

    private String pricelei;

    private Integer num;

    private String gztext;

    private String gzcause;

    private String wxgroup;

    public String getWxorders() {
        return wxorders;
    }

    public void setWxorders(String wxorders) {
        this.wxorders = wxorders == null ? null : wxorders.trim();
    }

    public String getXmname() {
        return xmname;
    }

    public void setXmname(String xmname) {
        this.xmname = xmname == null ? null : xmname.trim();
    }

    public String getPricelei() {
        return pricelei;
    }

    public void setPricelei(String pricelei) {
        this.pricelei = pricelei == null ? null : pricelei.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getGztext() {
        return gztext;
    }

    public void setGztext(String gztext) {
        this.gztext = gztext == null ? null : gztext.trim();
    }

    public String getGzcause() {
        return gzcause;
    }

    public void setGzcause(String gzcause) {
        this.gzcause = gzcause == null ? null : gzcause.trim();
    }

    public String getWxgroup() {
        return wxgroup;
    }

    public void setWxgroup(String wxgroup) {
        this.wxgroup = wxgroup == null ? null : wxgroup.trim();
    }
}