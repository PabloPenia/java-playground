package model;

import java.time.LocalDate;

public class Person {
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private Address address;
	private Person spouse;
	private Pet pet;
	
	public Person(String firstName, String lastName, LocalDate dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	
	public String getFirstName() {
		System.out.println("Name: " + firstName);
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("firstName successfully changed to " + firstName);
	}
}
