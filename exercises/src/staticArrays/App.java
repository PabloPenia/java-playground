package staticArrays;

import java.util.Scanner;

public class App {
	private static int array5Int[] = { 56, 98, 45, 6, 35 };
	private static int array10Int[] = { 56, 98, 45, 6, 35, 68, 7, 9, 6, 45 };
	private static int array15Int[] = { 56, 98, 45, 6, 35, 68, 7, 9, 6, 45, 87, 34, 666, 448, 87 };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
	}

	public static void showMenu() {
		Scanner input = new Scanner(System.in);
		int choice;

		do {
			System.out.println(
					"Menu:\n"
					+ "1. Mostrar 5 numeros.\n"
					+ "2. Sumar 10 numeros.\n"
					+ "3. Buscar String en Array (Lenguajes de prog.)\n"
					+ "4. Sustituir elemento por producto\n"
					+ "5. Buscar mayor y menor\n"
					+ "6. Sumar pares e impares\n"
					+ "7. Ordenar Array\n"
					+ "8.\n"
					+ "9.\n"
					+ "10.\n"
					+ "0. Salir");
			System.out.print("Ingrese su opcion: ");
			choice = input.nextInt();
			System.out.println("--------------------------------");
			switch (choice) {
			case 1:
				Ejercicio1 ejercicio1 = new Ejercicio1();
				ejercicio1.ingresarNumeros(input);
				break;
			case 2:
				Ejercicio2 ejercicio2 = new Ejercicio2();
				ejercicio2.sumar10Numeros(input);
				break;
			case 3:
				Ejercicio3 ejercicio3 = new Ejercicio3();
				ejercicio3.searchTerm(input);
				break;
			case 4:
				Ejercicio4 ejercicio4 = new Ejercicio4();
				
				ejercicio4.sustituirProducto(array10Int);
				break;
			case 5:
				Ejercicio5 ejercicio5 = new Ejercicio5();
				ejercicio5.buscarMaxMin(array10Int);
				break;
			case 6:
				Ejercicio6 ejercicio6 = new Ejercicio6();
				ejercicio6.sumarParesEImpares(array15Int);
				break;
			case 7:
				Ejercicio7 ejercicio7 = new Ejercicio7();
				ejercicio7.sortArray(array5Int);
				break;
			case 8:
			case 9:
			case 10:
				break;
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opcion no valida. Intente nuevamente.");
				break;
			}

			System.out.println("--------------------------------");
		} while (choice != 0);
		input.close();
		showMenu();
	}

}
