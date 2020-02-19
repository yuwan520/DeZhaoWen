package com.accp.dao.lirui;

import java.util.Date;

public class Dimss {
		private String dimissionid;

	    private Date dimissiontime;

	    private String dimissioncause;

	    private String dimissionname;
	    
	    private String empid;

		public String getDimissionid() {
			return dimissionid;
		}

		public void setDimissionid(String dimissionid) {
			this.dimissionid = dimissionid;
		}

		public Date getDimissiontime() {
			return dimissiontime;
		}

		public void setDimissiontime(Date dimissiontime) {
			this.dimissiontime = dimissiontime;
		}

		public String getDimissioncause() {
			return dimissioncause;
		}

		public void setDimissioncause(String dimissioncause) {
			this.dimissioncause = dimissioncause;
		}

		public String getDimissionname() {
			return dimissionname;
		}

		public void setDimissionname(String dimissionname) {
			this.dimissionname = dimissionname;
		}

		public String getEmpid() {
			return empid;
		}

		public void setEmpid(String empid) {
			this.empid = empid;
		}

		public Dimss(String dimissionid, Date dimissiontime, String dimissioncause, String dimissionname,
				String empid) {
			super();
			this.dimissionid = dimissionid;
			this.dimissiontime = dimissiontime;
			this.dimissioncause = dimissioncause;
			this.dimissionname = dimissionname;
			this.empid = empid;
		}

		public Dimss() {
			super();
		}

		@Override
		public String toString() {
			return "dimission [dimissionid=" + dimissionid + ", dimissiontime=" + dimissiontime + ", dimissioncause="
					+ dimissioncause + ", dimissionname=" + dimissionname + ", empid=" + empid + "]";
		}
}
