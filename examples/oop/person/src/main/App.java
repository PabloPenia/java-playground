package main;

import java.time.LocalDate;
import model.Person;
import model.Dog;

public class App {

	public static void main(String[] args) {
		Person someone = new Person("Tom", "Smith", LocalDate.of(1983, 12, 3));
		Person someoneElse = new Person("Janet", "Jackson", LocalDate.of(1985, 12, 3));

		someone.setSpouse(someoneElse);

		Dog fido = new Dog("Fido", LocalDate.of(2018, 5, 27));
		someone.setPet(fido);
		System.out.println(someone);
	}

}