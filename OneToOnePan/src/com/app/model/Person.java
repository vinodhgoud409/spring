package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ptab")
public class Person {
	@Id
	@Column(name="pid")
	private int perId;
	@Column(name="pname")
	private String perName;
	@Column(name="ploc")
	private String Loc;
	@OneToOne
	@JoinColumn(name="pidfk")
	private Pancard pob;
	public Person() {
		super();
	}
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public String getLoc() {
		return Loc;
	}
	public void setLoc(String loc) {
		Loc = loc;
	}
	public Pancard getPob() {
		return pob;
	}
	public void setPob(Pancard pob) {
		this.pob = pob;
	}
	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + ", Loc=" + Loc + ", pob=" + pob + "]";
	}

}
