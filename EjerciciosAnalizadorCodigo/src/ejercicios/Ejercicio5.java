package ejercicios;

import java.util.Scanner;
/**
 * comentario para la clase
 */

public class Ejercicio5 {
	/**
	 * metodo main para args
	 */
	
	public static void main(final String[] args) {

		final Scanner escaner = new Scanner(System.in);
		System.out.println("Cálculo de una potencia");

		System.out.print("Introduzca la base: ");
		final int base = escaner.nextInt();

		System.out.print("Introduzca el exponente: ");
		final int exponente = escaner.nextInt();

		double potencia = 1;

		if (exponente == 0) {
			potencia = 1;
		}

		if (exponente > 0) {
			for (int i = 0; i < exponente; i++) {
				potencia *= base;
			}
		}

		if (exponente < 0) {
			for (int i = 0; i < -exponente; i++) {
				potencia *= base;
			}

			potencia = 1 / potencia;
		}

		System.out.println(base + "^" + exponente + " = " + potencia);
		escaner.close();
	}
}
