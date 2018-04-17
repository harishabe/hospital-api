package com.hospital.app.dao;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class PatientRecord {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "lname")
	private String lname;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "address")
	private String address;
	@Column(name = "ph_num")
	private String ph_num;
	@Column(name="al_num")
	private String al_num;
	@Column(name = "bgroup")
	private String bgroup;
	@Column(name = "date")
	private String  date;
	public PatientRecord(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getlname() {
		return lname;
	}
	public void setlname(String lname) {
		this.lname=lname;
	}	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getPh_num() {
		return ph_num;
	}
	public void setPh_num(String ph_num) {
		this.ph_num=ph_num;
	}
	public void setAl_num(String al_num) {
		this.al_num=al_num;
	}
	public String getAl_num() {
		return al_num;
	}
	public String getBgroup() {
		return bgroup;
	}
	public void setBgroup(String bgroup) {
		this.bgroup=bgroup;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date=date;
	}

}
