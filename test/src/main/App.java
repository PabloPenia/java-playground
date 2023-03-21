package main;

import java.time.LocalDate;

import model.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person someone = new Person("Pablo", "Peña", LocalDate.of(1983, 12, 3));
		
		someone.getFirstName();
		someone.setFirstName("Roberto");
		someone.getFirstName();
	}

}
