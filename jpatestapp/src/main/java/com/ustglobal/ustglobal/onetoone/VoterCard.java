package com.ustglobal.ustglobal.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voterCard")
public class VoterCard {
	@Id
	@Column
	private int vid;
	@Column
	private String name;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "VoterCard [vid=" + vid + ", name=" + name + "]";
	}

	@OneToOne(mappedBy = "voterCard")
	// @Column(name = "id")
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
