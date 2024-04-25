package com.kb.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentLoginAttendanceBean  implements Serializable
{
	private String rollNo, name;
	public StudentLoginAttendanceBean() {}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
