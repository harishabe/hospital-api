package com.hospital.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "diseasesDetail")
public class DiseasesRecord {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "dId")
	private int dId;
	@Column(name = "pId")
	private int pId;
	@Column(name = "diseasesType")
	private String diseasesType;
	@Column(name="type1")
	private String type1;
	@Column(name="type2")
	private String type2;
	@Column(name="type3")
	private String type3;
	@Column(name="type4")
	private String type4;
	
	
	public DiseasesRecord() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId=dId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId=pId;
	}
	public String getDiseasesType() {
		return diseasesType;
	}
	public void setDiseasesType(String diseasesType) {
		this.diseasesType=diseasesType;
	}
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1=type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2=type2;
	}
	public String getType3() {
		return type3;
	}
	public void setType3(String type3) {
		this.type3=type3;
	}
	public String getType4() {
		return type4;
	}
	public void setType4(String type4) {
		this.type4=type4;
	}

}
