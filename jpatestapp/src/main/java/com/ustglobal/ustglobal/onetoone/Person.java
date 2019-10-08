package com.ustglobal.ustglobal.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pesron")
public class Person {
	@Id
	@Column
	private int id;
	@Column
	private String name;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vid")
	private VoterCard voterCard;

	public VoterCard getVotercard() {
		return voterCard;
	}

	public void setVotercard(VoterCard votercard) {
		this.voterCard = votercard;
	}

}
