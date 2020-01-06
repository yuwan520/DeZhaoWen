package com.accp.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class client {
    private String clientid;

    private String clientname;

    private String clientiphone;

    private String clientaddress;
    @JSONField(format="yyyy-mm-dd")
    private Date clientbirthday;

    private String clientbz;

    private String clientlb;

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getClientiphone() {
        return clientiphone;
    }

    public void setClientiphone(String clientiphone) {
        this.clientiphone = clientiphone == null ? null : clientiphone.trim();
    }

    public String getClientaddress() {
        return clientaddress;
    }

    public void setClientaddress(String clientaddress) {
        this.clientaddress = clientaddress == null ? null : clientaddress.trim();
    }

    public Date getClientbirthday() {
        return clientbirthday;
    }

    public void setClientbirthday(Date clientbirthday) {
        this.clientbirthday = clientbirthday;
    }

    public String getClientbz() {
        return clientbz;
    }

    public void setClientbz(String clientbz) {
        this.clientbz = clientbz == null ? null : clientbz.trim();
    }

    public String getClientlb() {
        return clientlb;
    }

    public void setClientlb(String clientlb) {
        this.clientlb = clientlb == null ? null : clientlb.trim();
    }
}