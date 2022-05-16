package com.qa.week3.day4.inheritance;

public class Man extends Mammal {
	private String name;
	private String nationality;
	
	public String talk() {
		return "man is talking";
	}
	public Man(float mass, String colour, int walkNum, String envi, String name, String nationality) {
		super(mass, colour, walkNum, envi);
		this.name = name;
		this.nationality = nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	

}
