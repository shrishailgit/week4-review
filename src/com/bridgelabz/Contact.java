package com.bridgelabz;

public class Contact {

	
    private	String firstname;
    private  String cityname;
    private String citylist;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getCitylist() {
		return citylist;
	}
	public void setCitylist(String citylist) {
		this.citylist = citylist;
	}
	public Contact(String firstname, String cityname, String citylist) {
		super();
		this.firstname = firstname;
		this.cityname = cityname;
		this.citylist = citylist;
	}

	 
	
}
