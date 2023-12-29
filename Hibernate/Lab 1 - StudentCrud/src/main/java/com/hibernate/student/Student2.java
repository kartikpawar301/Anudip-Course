package com.hibernate.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studId;
	
	@Column(name="Name", length = 20)
	private String studName;
	
	@Column(name="Course", length = 20)
	private String course;
	
	@Column(name="Phone_Number", length = 20)
	private long phone;

	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student2(int studId, String studName, String course, long phone) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.course = course;
		this.phone = phone;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName 
				+ ", course=" + course + ", phone=" + phone + "]";
	}
	
}
