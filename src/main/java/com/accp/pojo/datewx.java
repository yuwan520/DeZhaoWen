package com.accp.pojo;

public class datewx {
    private String maintainclass;

    private Integer projectid;

    private String projectname;

    private Integer price;

    private String incomeclass;

    private Integer bzprice;

    private Integer viprice;

    private Integer agreementprice;

    private Integer compensateforprice;

    private Integer insuranceprice;

    public String getMaintainclass() {
        return maintainclass;
    }

    public void setMaintainclass(String maintainclass) {
        this.maintainclass = maintainclass == null ? null : maintainclass.trim();
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getIncomeclass() {
        return incomeclass;
    }

    public void setIncomeclass(String incomeclass) {
        this.incomeclass = incomeclass == null ? null : incomeclass.trim();
    }

    public Integer getBzprice() {
        return bzprice;
    }

    public void setBzprice(Integer bzprice) {
        this.bzprice = bzprice;
    }

    public Integer getViprice() {
        return viprice;
    }

    public void setViprice(Integer viprice) {
        this.viprice = viprice;
    }

    public Integer getAgreementprice() {
        return agreementprice;
    }

    public void setAgreementprice(Integer agreementprice) {
        this.agreementprice = agreementprice;
    }

    public Integer getCompensateforprice() {
        return compensateforprice;
    }

    public void setCompensateforprice(Integer compensateforprice) {
        this.compensateforprice = compensateforprice;
    }

    public Integer getInsuranceprice() {
        return insuranceprice;
    }

    public void setInsuranceprice(Integer insuranceprice) {
        this.insuranceprice = insuranceprice;
    }
}