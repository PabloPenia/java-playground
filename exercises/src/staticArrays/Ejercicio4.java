package staticArrays;

public class Ejercicio4 {
	void sustituirProducto(int[] array) {
		System.out.println("Multiplicar cada elemento por su indice:");
		System.out.println("--------------------------------");
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * i;
			System.out.println("Resultado elemento " + i + ": " + array[i]);
		}
	}
}
