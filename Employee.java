package com.entity;

public class Employee {
 
	private int emp_id;
	private String emp_name;
	private long emp_salary;
	private String emp_city;
	private long emp_MobNum;
	
	private Country con;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public long getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(long emp_salary) {
		this.emp_salary = emp_salary;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public long getEmp_MobNum() {
		return emp_MobNum;
	}

	public void setEmp_MobNum(long emp_MobNum) {
		this.emp_MobNum = emp_MobNum;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	public Employee(int emp_id, String emp_name, long emp_salary, String emp_city, long emp_MobNum, Country con) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_city = emp_city;
		this.emp_MobNum = emp_MobNum;
		this.con = con;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_city="
				+ emp_city + ", emp_MobNum=" + emp_MobNum + ", con=" + con + "]";
	}
	
	
	
	
}
