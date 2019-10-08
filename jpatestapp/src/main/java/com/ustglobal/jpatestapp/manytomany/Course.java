package com.ustglobal.jpatestapp.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Id
	@Column
	private int cid;
	@Column
	private String cname;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "course")
	// @JoinTable(name = "Students_courses",joinColumns =
	// @JoinColumn(name="cid"),inverseJoinColumns = @JoinColumn(name = "sid"))
	private List<Student> student;

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
}
