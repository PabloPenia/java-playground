package staticArrays;

import java.util.Scanner;

public class Ejercicio2 {
	private int array[] = new int[10];
	private int suma = 0;
	
	public void sumar10Numeros(Scanner input) {
		System.out.println("Sumar 10 numeros");
		System.out.println("--------------------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ingrese un numero");
			if (input.hasNextInt()) {
				array[i] = input.nextInt();
			} else {
				input.next();
				System.out.println("Debe ingresar un numero");
				i--;
			}
		}
		System.out.println("--------------------------------");
		System.out.println("Numeros a sumar: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + (i < array.length - 1 ? " + " : "\n"));
			suma += array[i];
		}
		System.out.println("La suma de todos los elementos es: " + suma);
	}

}
