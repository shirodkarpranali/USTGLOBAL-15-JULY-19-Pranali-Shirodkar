package com.ustg.usttyspringcore.beans1;

public class Author {
	private String name;
	private Writer writer;

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [Name=" + name + ", writer=" + writer + "]";
	}

}
