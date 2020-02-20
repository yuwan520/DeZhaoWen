package com.accp.vo.liutao;

@SuppressWarnings("ALL")
public class vehicleInfo {
    private String status;

    private String btype;

    private String clientname;

    private String clientiphone;

    private String rorder;

    private String orderType;

    private String orderTime;

    private String consultant;

    private String carHno;

    private String colsing;

    private String expectedCompletion;

    private String complterTime;

    private boolean comstatus;

    public boolean isComstatus() {
        return comstatus;
    }

    public void setComstatus(boolean comstatus) {
        this.comstatus = comstatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getClientiphone() {
        return clientiphone;
    }

    public void setClientiphone(String clientiphone) {
        this.clientiphone = clientiphone;
    }

    public String getRorder() {
        return rorder;
    }

    public void setRorder(String rorder) {
        this.rorder = rorder;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public String getCarHno() {
        return carHno;
    }

    public void setCarHno(String carHno) {
        this.carHno = carHno;
    }

    public String getColsing() {
        return colsing;
    }

    public void setColsing(String colsing) {
        this.colsing = colsing;
    }

    public String getExpectedCompletion() {
        return expectedCompletion;
    }

    public void setExpectedCompletion(String expectedCompletion) {
        this.expectedCompletion = expectedCompletion;
    }

    public String getComplterTime() {
        return complterTime;
    }

    public void setComplterTime(String complterTime) {
        this.complterTime = complterTime;
    }
}
