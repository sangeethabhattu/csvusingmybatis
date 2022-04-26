package com.letigation.model;

public class attorneytable {
	
	
	String firmname;
	String attorneyname;
	String city;
	int cellphone1;
	String address1;
	String email1;
	public String getFirmname() {
		return firmname;
	}
	public void setFirmname(String firmname) {
		this.firmname = firmname;
	}
	public String getAttorneyname() {
		return attorneyname;
	}
	public void setAttorneyname(String attorneyname) {
		this.attorneyname = attorneyname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCellphone() {
		return cellphone1;
	}
	public void setCellphone(int cellphone) {
		this.cellphone1 = cellphone;
	}
	public String getAddress() {
		return address1;
	}
	public void setAddress(String address) {
		this.address1 = address;
	}
	public String getEmail() {
		return email1;
	}
	public void setEmail(String email) {
		this.email1 = email;
	}
	@Override
	public String toString() {
		return "attorneytable [firmname=" + firmname + ", attorneyname=" + attorneyname + ", city=" + city
				+ ", cellphone=" + cellphone1 + ", address=" + address1+ ", email=" + email1 + ", getFirmname()="
				+ getFirmname() + ", getAttorneyname()=" + getAttorneyname() + ", getCity()=" + getCity()
				+ ", getCellphone()=" + getCellphone() + ", getAddress()=" + getAddress() + ", getEmail()=" + getEmail()
				+ "]";
	}
	
	
	

}
