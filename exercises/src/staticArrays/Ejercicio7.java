package staticArrays;

import java.util.Arrays;

public class Ejercicio7 {
	void sortArray(int[] array) {
		System.out.println("Ordenar Array:");
		System.out.println("--------------------------------");
		Arrays.sort(array);
		System.out.print("Array ordenado: ");
		for(int el : array) {
			System.out.print(el + ", ");
		}
		System.out.println();
	}
}
