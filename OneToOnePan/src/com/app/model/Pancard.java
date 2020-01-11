package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pantab")
public class Pancard {
	@Id
	@Column(name="pid")
	private int panId;
	@Column(name="pname")
	private String nameOnPan;
	@Column(name="pfname")
	private String fatherName;
	@Column(name="dob")
	private String dob;
	@Column(name="pdf")
	private String dateOfIssue;
	public Pancard() {
		super();
	}
	public int getPanId() {
		return panId;
	}
	public void setPanId(int panId) {
		this.panId = panId;
	}
	public String getNameOnPan() {
		return nameOnPan;
	}
	public void setNameOnPan(String nameOnPan) {
		this.nameOnPan = nameOnPan;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	@Override
	public String toString() {
		return "Pancard [panId=" + panId + ", nameOnPan=" + nameOnPan + ", fatherName=" + fatherName + ", dob=" + dob
				+ ", dateOfIssue=" + dateOfIssue + "]";
	}

}
