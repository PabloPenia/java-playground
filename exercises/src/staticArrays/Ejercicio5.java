package staticArrays;

public class Ejercicio5 {
	void buscarMaxMin(int[] array) {
		System.out.println("Buscar valor maximo y minimo en array:");
		System.out.println("--------------------------------");
		int max = array[0];
		int min = array[0];
		
		for(int num : array) {
			if(num < min) min = num;
			if(num > max) max = num;
		}
		System.out.println("Maximo: " + max + ".\nMinimo: " + min + ".");
	}
}
