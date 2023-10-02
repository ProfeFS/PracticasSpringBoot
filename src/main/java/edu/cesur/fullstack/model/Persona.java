package edu.cesur.fullstack.model; //se suelen poner domain o model

import lombok.Data;

@Data
public class Persona {

	private int id;
	private String name;
	private String lastName;
	private int age;

	public Persona(int id, String name, String lastName, int age) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	@Override
//	public String toString() {
//		return "Persona [id = " + id + ", name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

}