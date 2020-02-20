package com.accp.pojo.liutao;

public class maintains {
    private String wxorders;

    private String itemName;

    private String pricelei;

    private Integer num;

    private String gztext;

    private String gzcause;

    private String wxgroup;

    private String coding;

    public String getWxorders() {
        return wxorders;
    }

    public void setWxorders(String wxorders) {
        this.wxorders = wxorders == null ? null : wxorders.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
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