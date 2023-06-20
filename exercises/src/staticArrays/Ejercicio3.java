package staticArrays;

import java.util.Scanner;

public class Ejercicio3 {
	String langs[] = { "Java", "C", "C#", "C++", "Php", "Javascript", "Python", "Cobol", "Ruby", "Go", "Kotlin",
			"Swift", "R", "Matlab", "Scala", "Rust", "Perl" };
	void searchTerm(Scanner input) {
		System.out.println("Buscar un lenguaje de programacion");
		System.out.println("--------------------------------");
		String term;
		boolean found = false;
		System.out.println("Ingrese el termino de la busqueda:\n");
		input.nextLine();
		term = input.nextLine().toLowerCase();
		
		for(String i : langs) {
			if (i.toLowerCase().equals(term)) {
				found = true;
				break;
			}
		}
		
		System.out.println(found ? "Encontrado!" : "NO encontrado"); 
	}
}
