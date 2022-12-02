package ejercicios;

import java.util.Scanner;
/**
 * comentario para la clase
 */

public class Ejercicio3 {
	/**
	 * metodo main para args
	 */
	
	public static void main(final String[] args) {

		final Scanner escaner = new Scanner(System.in);

		System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
		System.out.print("Por favor, introduzca n: ");
		int numero = escaner.nextInt();

		switch (numero) {
		case 1:
			System.out.print("0");
			break;
		case 2:
			System.out.print("0 1");
			break;
		default:
			System.out.print("0 1");
			int fibonacci1 = 0;
			int fibonacci2 = 1;
			int aux;
			while (numero > 2) {
				aux = fibonacci1;
				fibonacci1 = fibonacci2;
				fibonacci2 = aux + fibonacci2;
				System.out.print(" " + fibonacci2);
				numero--;
			}
			break;
		}
		System.out.println();
		escaner.close();
	}
}
