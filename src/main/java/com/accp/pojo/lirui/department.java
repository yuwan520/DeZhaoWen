package com.accp.pojo.lirui;

public class department {
    private String departmentid;

    private String departmentname;

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

	public department(String departmentid, String departmentname) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
	}

	public department() {
		super();
	}

	@Override
	public String toString() {
		return "department [departmentid=" + departmentid + ", departmentname=" + departmentname + "]";
	}
}