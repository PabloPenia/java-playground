package main;

import java.time.LocalDate;
import model.Person;
import model.Dog;
import model.Cat;

public class App {

  public static void main(String[] args) {
	Person tom = new Person("Tom", "Smith", LocalDate.of(1983, 12, 3));
	Person janet = new Person("Janet", "Jackson",
		LocalDate.of(1985, 12, 3));

	tom.setSpouse(janet);
	
	Cat felix = new Cat("Felix", LocalDate.of(2020, 8, 17));
	Dog fido = new Dog("Fido", LocalDate.of(2018, 5, 27));
	tom.setPet(fido);
	janet.setPet(felix);
	System.out.println(tom);
	felix.meow();
	fido.bark();
  }

}