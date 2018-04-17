package com.hospital.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class DoctorRecord {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "fname")
	private String fname;
	@Column(name = "lname")
	private String lname;
	@Column(name = "email")
	private String email;
	@Column(name = "ph_num")
	private String ph_num;
	@Column(name = "pwd")
	private String pwd;
	public DoctorRecord(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname=fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getPh_num() {
		return ph_num;
	}
	public void setPh_num(String ph_num) {
		this.ph_num=ph_num;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}

}
