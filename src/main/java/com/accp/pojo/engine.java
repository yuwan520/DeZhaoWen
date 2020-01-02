package com.accp.pojo;

public class engine {
    private String engineid;

    private String enginename;

    public String getEngineid() {
        return engineid;
    }

    public void setEngineid(String engineid) {
        this.engineid = engineid == null ? null : engineid.trim();
    }

    public String getEnginename() {
        return enginename;
    }

    public void setEnginename(String enginename) {
        this.enginename = enginename == null ? null : enginename.trim();
    }
}