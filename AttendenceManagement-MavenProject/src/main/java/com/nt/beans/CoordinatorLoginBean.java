package com.nt.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CoordinatorLoginBean implements Serializable
{
	private String name, rollno, subjectTeach;
	public CoordinatorLoginBean() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getSubjectTeach() {
		return subjectTeach;
	}
	public void setSubjectTeach(String subjectTeach) {
		this.subjectTeach = subjectTeach;
	}
	
}
