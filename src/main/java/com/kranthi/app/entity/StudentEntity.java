package com.kranthi.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="student_info")
public class StudentEntity implements Serializable {
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="alt_key")
	private long altKey;
	@Column(name="name")
	private String name;
	@Column(name="marks")
	private int marks;
	@Column(name="address")
	private String address;
	@Column(name="surname")
	private String surname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public long getAltKey() {
		return altKey;
	}
	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentEntity [altKey=" + altKey + ", name=" + name + ", marks=" + marks + ", address=" + address
				+ ", surname=" + surname + "]";
	}

}
