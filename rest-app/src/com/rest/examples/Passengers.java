package com.rest.examples;

public class Passengers {

	private String name;
	private gender gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public gender getGender() {
		return gender;
	}
	public void setGender(gender gender) {
		this.gender = gender;
	}
	public status getStatus() {
		return status;
	}
	public void setStatus(status status) {
		this.status = status;
	}
	private status status;
	
	public static enum gender{
		MALE , FEMALE , OTHER ;
	}
	public static enum status {
		WAITING , RAC , CONFIRMED ;
	}
	
}
