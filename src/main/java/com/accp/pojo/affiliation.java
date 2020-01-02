package com.accp.pojo;

public class affiliation {
    private String affiliationid;

    private String affiliationname;

    public String getAffiliationid() {
        return affiliationid;
    }

    public void setAffiliationid(String affiliationid) {
        this.affiliationid = affiliationid == null ? null : affiliationid.trim();
    }

    public String getAffiliationname() {
        return affiliationname;
    }

    public void setAffiliationname(String affiliationname) {
        this.affiliationname = affiliationname == null ? null : affiliationname.trim();
    }
}