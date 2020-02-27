package com.accp.pojo.bmx;

public class datewx {
    private String maintainclass;

    private Integer projectid;

    private String projectname;

    private String price;

    private String incomeclass;

    private int hyrice;
    public int getHyrice() {
		return hyrice;
	}

	public void setHyrice(int hyrice) {
		this.hyrice = hyrice;
	}

	private Integer bzprice;

    private Integer vipprice;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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
        return vipprice;
    }

    public void setViprice(Integer viprice) {
        this.vipprice = viprice;
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