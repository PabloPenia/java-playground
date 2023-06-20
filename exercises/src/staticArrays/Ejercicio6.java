package staticArrays;

public class Ejercicio6 {
	void sumarParesEImpares(int[] array) {
		System.out.println("Sumar pares e impares:");
		System.out.println("--------------------------------");
		int sumaPares = 0;
		int sumaImpares = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
				sumaPares += array[i];
			} else {
				sumaImpares += array[i];
			}
		}
		System.out.println("Suma de valores pares: " + sumaPares + ".\nSuma de valores impares: " + sumaImpares + ".");
	}
}
