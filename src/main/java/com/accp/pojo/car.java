package com.accp.pojo;

public class car {
    private String numbercar;

    private String brands;

    private String typecar;

    private Integer mileage;

    private Integer teamno;

    public String getNumbercar() {
        return numbercar;
    }

    public void setNumbercar(String numbercar) {
        this.numbercar = numbercar == null ? null : numbercar.trim();
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands == null ? null : brands.trim();
    }

    public String getTypecar() {
        return typecar;
    }

    public void setTypecar(String typecar) {
        this.typecar = typecar == null ? null : typecar.trim();
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getTeamno() {
        return teamno;
    }

    public void setTeamno(Integer teamno) {
        this.teamno = teamno;
    }
}