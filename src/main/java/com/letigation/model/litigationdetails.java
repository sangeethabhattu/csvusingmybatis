package com.letigation.model;

public class litigationdetails {
	
	
	    int litigationid;
		String litigationtype;
		String litigationstatus;
		String litigationcause;
		String litigationcausename;
		String plaintiffname;
		String venuecity;
		String state;
		String documentname;
		String litigationbudget;
		public int getLitigationid() {
			return litigationid;
		}
		public void setLitigationid(int litigationid) {
			this.litigationid = litigationid;
		}
		public String getLitigationtype() {
			return litigationtype;
		}
		public void setLitigationtype(String litigationtype) {
			this.litigationtype = litigationtype;
		}
		public String getLitigationstatus() {
			return litigationstatus;
		}
		public void setLitigationstatus(String litigationstatus) {
			this.litigationstatus = litigationstatus;
		}
		public String getLitigationcause() {
			return litigationcause;
		}
		public void setLitigationcause(String litigationcause) {
			this.litigationcause = litigationcause;
		}
		public String getLitigationcausename() {
			return litigationcausename;
		}
		public void setLitigationcausename(String litigationcausename) {
			this.litigationcausename = litigationcausename;
		}
		public String getPlaintiffname() {
			return plaintiffname;
		}
		public void setPlaintiffname(String plaintiffname) {
			this.plaintiffname = plaintiffname;
		}
		public String getVenuecity() {
			return venuecity;
		}
		public void setVenuecity(String venuecity) {
			this.venuecity = venuecity;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getDocumentname() {
			return documentname;
		}
		public void setDocumentname(String documentname) {
			this.documentname = documentname;
		}
		public String getLitigationbudget() {
			return litigationbudget;
		}
		public void setLitigationbudget(String litigationbudget) {
			this.litigationbudget = litigationbudget;
		}
		@Override
		public String toString() {
			return "litigationdetails [litigationid=" + litigationid + ", litigationtype=" + litigationtype
					+ ", litigationstatus=" + litigationstatus + ", litigationcause=" + litigationcause
					+ ", litigationcausename=" + litigationcausename + ", plaintiffname=" + plaintiffname
					+ ", venuecity=" + venuecity + ", state=" + state + ", documentname=" + documentname
					+ ", litigationbudget=" + litigationbudget + ", getLitigationid()=" + getLitigationid()
					+ ", getLitigationtype()=" + getLitigationtype() + ", getLitigationstatus()="
					+ getLitigationstatus() + ", getLitigationcause()=" + getLitigationcause()
					+ ", getLitigationcausename()=" + getLitigationcausename() + ", getPlaintiffname()="
					+ getPlaintiffname() + ", getVenuecity()=" + getVenuecity() + ", getState()=" + getState()
					+ ", getDocumentname()=" + getDocumentname() + ", getLitigationbudget()=" + getLitigationbudget()
					+ "]";
		}
		
		
		
		
		
}

