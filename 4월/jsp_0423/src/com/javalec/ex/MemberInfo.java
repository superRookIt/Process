package com.javalec.ex;

public class MemberInfo {

	public MemberInfo() {

	}

	public MemberInfo(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;

	}

	String name;
	String id;
	String pw;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
