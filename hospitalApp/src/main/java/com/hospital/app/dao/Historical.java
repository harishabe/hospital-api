package com.hospital.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historic")
public class Historical {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "dId")
	private int dId;
	@Column(name = "pId")
	private int pId;
	@Column(name="accident")
	private String accident;
	@Column(name="operations")
	private String operations;
	@Column(name="drugallergies")
	private String drugallergies;
	@Column(name="other")
	private String other;
	
	public Historical() {
		
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId=dId;
	}
	
	public String getAccident() {
		return accident;
	}
	public void setAccident(String accident) {
		this.accident=accident;
	}
	
	public String getOperations() {
		return operations;
	}
	public void setOperations(String operations) {
		this.operations=operations;
	}
	
	public String getDrugallergies() {
		return drugallergies;
	}
	public void setDrugallergies(String drugallergies) {
		this.drugallergies=drugallergies;
	}
	
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other=other;
	}
	
	
}
