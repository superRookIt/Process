package com.javalec.ex;

public class Person {

	public Person() {

	}

	//private하면 다른데서 Person의 String name, id같은 걸 만들어서 변경할 수 없음
	
	private String name;
	private String id;
	private String pw;
	private String gender;
	private String address;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
