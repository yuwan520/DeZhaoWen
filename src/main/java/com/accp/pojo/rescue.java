package com.accp.pojo;

import java.util.Date;

public class rescue {
    private String carhao;

    private String businesstype;

    private Date gooff;

    private String goaddress;

    private String drivecar;

    private Date shigongtime;

    private String succordz;

    private Date wangtime;

    private String estimate;

    private String mnote;

    private String statement;

    private String driver;

    private String drivertele;

    public String getCarhao() {
        return carhao;
    }

    public void setCarhao(String carhao) {
        this.carhao = carhao == null ? null : carhao.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public Date getGooff() {
        return gooff;
    }

    public void setGooff(Date gooff) {
        this.gooff = gooff;
    }

    public String getGoaddress() {
        return goaddress;
    }

    public void setGoaddress(String goaddress) {
        this.goaddress = goaddress == null ? null : goaddress.trim();
    }

    public String getDrivecar() {
        return drivecar;
    }

    public void setDrivecar(String drivecar) {
        this.drivecar = drivecar == null ? null : drivecar.trim();
    }

    public Date getShigongtime() {
        return shigongtime;
    }

    public void setShigongtime(Date shigongtime) {
        this.shigongtime = shigongtime;
    }

    public String getSuccordz() {
        return succordz;
    }

    public void setSuccordz(String succordz) {
        this.succordz = succordz == null ? null : succordz.trim();
    }

    public Date getWangtime() {
        return wangtime;
    }

    public void setWangtime(Date wangtime) {
        this.wangtime = wangtime;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate == null ? null : estimate.trim();
    }

    public String getMnote() {
        return mnote;
    }

    public void setMnote(String mnote) {
        this.mnote = mnote == null ? null : mnote.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getDrivertele() {
        return drivertele;
    }

    public void setDrivertele(String drivertele) {
        this.drivertele = drivertele == null ? null : drivertele.trim();
    }
}