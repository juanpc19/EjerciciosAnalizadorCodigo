package ejercicios;

import java.util.Scanner;
	/**
	 * comentario para la clase
	 */

public class Ejercicio1 {
	/**
	 * comentario para la CLAVE
	 */
	
	public static final int CLAVE = 8888;
	/**
	 * metodo main para args
	 */
	
	public static void main(final String[] args) {
		

		final Scanner escaner = new Scanner(System.in);

		int intentos = 4;
		int numeroIntroducido;
		boolean acertado = false;

		do {
			System.out.print("Introduzca la clave de la caja fuerte: ");
			numeroIntroducido = escaner.nextInt();

			if (numeroIntroducido == CLAVE) {
				acertado = true;
			} else {
				System.out.println("Clave incorrecta");
			}

			intentos--;

		} while (intentos > 0 && !acertado);
		
	

		if (acertado) {
			System.out.println("Ha abierto la caja fuerte.");
		} else {
			System.out.println("Lo siento, ha agotado las 4 oportunidades.");
		}
		escaner.close();
	}
}
