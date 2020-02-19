package com.accp.pojo.lirui;

public class payroll {
    private String payrollid;

    private String payrollname;

    public String getPayrollid() {
        return payrollid;
    }

    public void setPayrollid(String payrollid) {
        this.payrollid = payrollid == null ? null : payrollid.trim();
    }

    public String getPayrollname() {
        return payrollname;
    }

    public void setPayrollname(String payrollname) {
        this.payrollname = payrollname == null ? null : payrollname.trim();
    }

	public payroll(String payrollid, String payrollname) {
		super();
		this.payrollid = payrollid;
		this.payrollname = payrollname;
	}

	public payroll() {
		super();
	}

	@Override
	public String toString() {
		return "payroll [payrollid=" + payrollid + ", payrollname=" + payrollname + "]";
	}
}