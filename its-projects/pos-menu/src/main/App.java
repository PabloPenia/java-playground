package main;

import java.util.Scanner;

public class App {

  private static String[] products = { "PRD001", "PRD002", "PRD003", "PRD004",
	  "PRD005" };
//  private static String[] cart = { "PRD001", "PRD002", "PRD003", "PRD004", "PRD005" };
  private static String[] cart = new String[10];
  private static String[] history = new String[10];

  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	displayMenu(input);
	input.close();
  }

  /**
   * MOSTRAR MENU
   */
  private static void displayMenu(Scanner input) {
	final String MENU = formatText("==== Menu de la Tienda ====\n", null) +
		"1. Agregar un item al carro\n" +
		"2. Eliminar un item del carro\n" +
		"3. Ver carro\n" +
		"4. Procesar pago\n" +
		"5. Ver historial de compras\n" +
		"6. Salir\n" +
		formatText("Ingrese una opcion: ", null);
	int option;
	do {
	  System.out.print(MENU);
	  option = input.nextInt();
	  input.nextLine();
	  switch (option) {
	  case 1:
		addItem(input);
		break;
	  case 2:
		removeItem(input);
		break;
	  case 3:
		System.out.println(formatText("Items en el carro:", null));
		listItems(cart, input);
		break;
	  case 4:
		checkout(input);
		break;
	  case 5:
		System.out.println(formatText("Historial de compras:", null));
		listItems(history, input);
		break;
	  case 6:
		System.out.println(
			formatText("Gracias por comprar en nuestra tienda.", "green"));
		break;
	  default:
		System.out.println(
			formatText("Opcion invalida, intentelo nuevamente.", "red"));
		break;
	  }
	} while (option != 6);

  }

  /**
   * AGREGAR ITEMS AL CARRO
   */
  private static void addItem(Scanner input) {
	// Chequear que haya lugar en el carro antes de empezar.
	int cartIndex = indexOf(cart, null);
	if (cartIndex < 0) {
	  System.out.println(
		  formatText(
			  "El carro esta lleno, elimine un item o procese la compra para continuar.",
			  "red"));
	  displayMenu(input);
	}
	// prompts
	String prod, quantity;
	// Producto
	System.out.println(
		formatText("Agregar un item al carro.", "green")
			+ "\nProductos disponibles: PRD001, PRD002, PRD003, PRD004, PRD005."
			+ formatText("\nIngrese el id del producto", null));
	prod = input.nextLine().toUpperCase();
	checkString(prod, input);
	int itemFound = indexOf(products, prod);
	if (itemFound < 0) {
	  System.out
		  .println(formatText(
			  "No hay exitencias para este producto en la base de datos",
			  "red"));
	  displayMenu(input);
	}
	// Cantidad
	System.out.println(formatText("Ingrese la cantidad deseada", null));
	quantity = input.nextLine();
	checkString(quantity, input);
	boolean isValidQty = isValidNum(quantity);
	if (!isValidQty) {
	  System.out.println(formatText("Debe ingresar un numero.", "red"));
	  displayMenu(input);
	}
	// Agregar el item
	cart[cartIndex] = prod;
	System.out.println(
		formatText(
			"Se agregaron " + quantity + " unidades de " + prod + " al carro.",
			"green"));
	displayMenu(input);
  }

  /**
   * ELIMINAR ITEMS DEL CARRO
   */
  private static void removeItem(Scanner input) {
	// TODO Auto-generated method stub
	String prod;
	System.out.println(
		formatText("Eliminar un item al carro.", null)
			+ "\nIngrese el id del producto");
	prod = input.nextLine().toUpperCase();
	checkString(prod, input);
	int itemIdx = indexOf(cart, prod);
	if (itemIdx < 0) {
	  System.out
		  .println(formatText(
			  "El producto que quiere eliminar no existe en el carro.", "red"));
	} else {
	  // El producto existe, lo elimino.
	  cart[itemIdx] = null;
	  System.out
		  .println(formatText("Se elimino " + prod + " del carro.", "green"));
	}
	displayMenu(input);
  }

  /**
   * PROCESAR PAGO
   */
  private static void checkout(Scanner input) {
	String pago;
	System.out.println(formatText("Ingrese el importe de la compra", null));
	pago = input.nextLine();
	checkString(pago, input);
	int idxToStore = indexOf(history, null);

	if (isValidNum(pago) && idxToStore >= 0) {
	  history[idxToStore] = pago;
	  for (int i = 0; i < cart.length; i++) {
		cart[i] = null;
	  }
	  System.out.println(
		  formatText(
			  "El pago se ha efectuado correctamente, su carro ahora esta vacio.",
			  "green"));
	} else {
	  System.out.println(
		  formatText(
			  "El monto ingresado no es correcto o no hay lugar en el historial. \nVerifique e intente nuevamente",
			  "red"));
	}

	displayMenu(input);
  }

  /**
   * FUNCIONES Y UTILIDADES
   * 
   * @return
   * @return
   */
  private static void checkString(String str, Scanner input) {
	if (str.isEmpty()) {
	  System.out
		  .println(formatText(
			  "No se han ingresado los datos solicitados, intentelo nuevamente.",
			  "red"));
	  displayMenu(input);
	}
  }

  private static void listItems(Object[] arr, Scanner input) {
	// Listar todos los items
	int emptyIdx = 0;
	for (int i = 0; i < arr.length; i++) {
	  if (arr[i] != null) {
		System.out.println(arr[i]);
	  } else {
		emptyIdx++;
	  }
	}

	if (emptyIdx == arr.length)
	  System.out
		  .println("No hay items que mostrar.");

	displayMenu(input);
  }

  private static int indexOf(Object[] arr, Object val) {
	// implementa algo similar al indexOf de javascript
	for (int i = 0; i < arr.length; i++) {
	  if ((val == null && arr[i] == null)
		  || (val != null && val.equals(arr[i]))) {
		return i;
	  }
	}
	return -1;
  }

  private static boolean isValidNum(String value) {
	return value.matches("\\d+") && Integer.parseInt(value) > 0;
  }

  public static String formatText(String text, String color) {
	String ANSI_RESET = "\u001B[0m";
	String ANSI_BOLD = "\u001B[1m";
	String ANSI_RED = "\u001B[31m";
	String ANSI_GREEN = "\u001B[32m";
	if (color != null) {
	  switch (color) {
	  case "red":
		return ANSI_BOLD + ANSI_RED + text + ANSI_RESET;
	  case "green":
		return ANSI_BOLD + ANSI_GREEN + text + ANSI_RESET;
	  default:
	  }
	}
	return ANSI_BOLD + text + ANSI_RESET;
  }
}
