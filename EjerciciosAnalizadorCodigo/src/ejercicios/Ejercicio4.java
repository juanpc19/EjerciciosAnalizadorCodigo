package ejercicios;

import java.util.Scanner;
/**
 * comentario para la clase
 */

public class Ejercicio4 {
	/**
	 * metodo main para args
	 */
	
	public static void main(final String[] args) {
		final Scanner escaner = new Scanner(System.in);
		int numero;

		System.out.println("Por favor, introduzca 10 n�meros enteros: ");

		int negativos = 0;
		int positivos = 0;

		for (int i = 0; i < 10; i++) {
			numero = escaner.nextInt();

			if (numero < 0) {
				negativos++;
			} else {
				positivos++;
			}
		}

		System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
		escaner.close();
	}
}
