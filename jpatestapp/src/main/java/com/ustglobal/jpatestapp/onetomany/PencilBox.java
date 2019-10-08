package com.ustglobal.jpatestapp.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pencilbox")
public class PencilBox {
	@Id
	@Column
	private int boxid;
	@Column
	private String bname;

	@Override
	public String toString() {
		return "PencilBox [id=" + boxid + ", name=" + bname + "]";
	}

	public int getBoxid() {
		return boxid;
	}

	public void setBoxid(int boxid) {
		this.boxid = boxid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public List<Pencils> getPencils() {
		return pencils;
	}

	public void setPencils(List<Pencils> pencils) {
		this.pencils = pencils;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "boxid", nullable = false)
	private List<Pencils> pencils;
}
