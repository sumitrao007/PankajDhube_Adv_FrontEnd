package com.hefshine.bean;

//Pojo=Plain old java Object
//1 It conatin Db col name As data member
//2 It cinatin Parametrized Constructor
//3 It contain toString method
//4 It contain parameterless constructor (Optional)
//5 Getter & setter method

public class Employee {
	
	int empid;
	String fname;
	String lname;
	String emailid;
	String mobileno;
	
	public Employee() {
		
	}
	
	
	public Employee(int empid, String fname, String lname, String emailid, String mobileno) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
		this.mobileno = mobileno;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + ", lname=" + lname + ", emailid=" + emailid
				+ ", mobileno=" + mobileno + "]";
	}
	
	
	
	
	

}
