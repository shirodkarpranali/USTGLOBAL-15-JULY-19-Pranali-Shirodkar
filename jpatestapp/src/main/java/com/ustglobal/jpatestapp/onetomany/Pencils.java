package com.ustglobal.jpatestapp.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pencils")
public class Pencils {
	@Id
	@Column
	private int pid;
	@Column
	private String pname;

	@Override
	public String toString() {
		return "Pencils [pid=" + pid + ", pname=" + pname + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@OneToMany(mappedBy = "pencils")
	private PencilBox pencilBox;

	public PencilBox getPencilBox() {
		return pencilBox;
	}

	public void setPencilBox(PencilBox pencilBox) {
		this.pencilBox = pencilBox;
	}

}
