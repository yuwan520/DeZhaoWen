package com.accp.pojo;

import java.util.Date;

public class dimission {
    private String dimissionid;

    private Date dimissiontime;

    private String dimissioncause;

    private String dimissionname;

    public String getDimissionid() {
        return dimissionid;
    }

    public void setDimissionid(String dimissionid) {
        this.dimissionid = dimissionid == null ? null : dimissionid.trim();
    }

    public Date getDimissiontime() {
        return dimissiontime;
    }

    public void setDimissiontime(Date dimissiontime) {
        this.dimissiontime = dimissiontime;
    }

    public String getDimissioncause() {
        return dimissioncause;
    }

    public void setDimissioncause(String dimissioncause) {
        this.dimissioncause = dimissioncause == null ? null : dimissioncause.trim();
    }

    public String getDimissionname() {
        return dimissionname;
    }

    public void setDimissionname(String dimissionname) {
        this.dimissionname = dimissionname == null ? null : dimissionname.trim();
    }
}