package com.accp.pojo;

public class teams {
    private Integer teamno;

    private String teamsname;

    private Integer bossnos;

    public Integer getTeamno() {
        return teamno;
    }

    public void setTeamno(Integer teamno) {
        this.teamno = teamno;
    }

    public String getTeamsname() {
        return teamsname;
    }

    public void setTeamsname(String teamsname) {
        this.teamsname = teamsname == null ? null : teamsname.trim();
    }

    public Integer getBossnos() {
        return bossnos;
    }

    public void setBossnos(Integer bossnos) {
        this.bossnos = bossnos;
    }
}