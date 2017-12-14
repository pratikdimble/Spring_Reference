package com.app.model;
import com.app.model.address;
public class employee {
	private int empid;
	private String empname;
	private float salary;
	private address addr;
	
	public employee() {
		super();
		System.out.println("\t\t***WELCOME TO EMPLOYEE***");
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	public address getAddr() {
		return addr;
	}
	public void setAddr(address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", addr=" + addr + "]";
	}
	
	


}
