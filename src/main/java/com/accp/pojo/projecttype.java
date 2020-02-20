package com.accp.pojo;

import java.util.List;

public class projecttype {
    private String pno;

    private String pname;

    private List<Pdetails> pdetails;

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno == null ? null : pno.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public List<Pdetails> getPdetails() {
        return pdetails;
    }

    public void setPdetails(List<Pdetails> pdetails) {
        this.pdetails = pdetails;
    }
}