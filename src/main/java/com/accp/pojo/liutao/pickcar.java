package com.accp.pojo.liutao;




import java.util.List;

public class pickcar {
    private String carno;

    private String consultant;

    private String driver;

    private String driverphone;

    private String businesstype;

    private String construction;

    private String pickone;

    private String expectedcompletion;

    private String clearing;

    private String estimated;

    private String remark;

    private String repairs;

    private String complterTime;

    private String wx;

    private List<maintains> maintains;

    private mrecord mrecord;

    public List<com.accp.pojo.liutao.maintains> getMaintains() {
        return maintains;
    }

    public void setMaintains(List<com.accp.pojo.liutao.maintains> maintains) {
        this.maintains = maintains;
    }

    public com.accp.pojo.liutao.mrecord getMrecord() {
        return mrecord;
    }

    public void setMrecord(com.accp.pojo.liutao.mrecord mrecord) {
        this.mrecord = mrecord;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant == null ? null : consultant.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone == null ? null : driverphone.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction == null ? null : construction.trim();
    }

    public String getPickone() {
        return pickone;
    }

    public void setPickone(String pickone) {
        this.pickone = pickone == null ? null : pickone.trim();
    }

    public String getExpectedcompletion() {
        return expectedcompletion;
    }

    public void setExpectedcompletion(String expectedcompletion) {
        this.expectedcompletion = expectedcompletion;
    }

    public String getClearing() {
        return clearing;
    }

    public void setClearing(String clearing) {
        this.clearing = clearing == null ? null : clearing.trim();
    }

    public String getEstimated() {
        return estimated;
    }

    public void setEstimated(String estimated) {
        this.estimated = estimated == null ? null : estimated.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRepairs() {
        return repairs;
    }

    public void setRepairs(String repairs) {
        this.repairs = repairs == null ? null : repairs.trim();
    }

    public String getComplterTime() {
        return complterTime;
    }

    public void setComplterTime(String complterTime) {
        this.complterTime = complterTime;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }
}