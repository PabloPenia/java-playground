package staticArrays;

import java.util.Scanner;

public class Ejercicio1 {
	private int array[] = new int[5];

	public void ingresarNumeros(Scanner input) {
		System.out.println("Mostrar 5 numeros");
		System.out.println("--------------------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ingrese un numero");
			while (!input.hasNextInt()) {
				input.next();
				System.out.println("Debe ingresar un numero");
			}
			array[i] = input.nextInt();
		}
		System.out.println("--------------------------------");
		System.out.println("Numeros ingresados: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + (i < array.length - 1 ? ", " : ".\n"));
		}
	}
}
