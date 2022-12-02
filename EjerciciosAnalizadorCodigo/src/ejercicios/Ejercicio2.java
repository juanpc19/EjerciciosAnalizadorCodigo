package ejercicios;

import java.util.Scanner;
/**
 * comentario para la clase
 */

public class Ejercicio2 {
	/**
	 * metodo main para args
	 */
	
	public static void main(final String[] args) {
		
		final Scanner escaner=new Scanner(System.in);
	    
	    int numeroDeDigitos = 1, eraN, numeroIntroducido;

	    System.out.print("Introduzca un n�mero entero y le dir� cu�ntos d�gitos tiene: ");
	    numeroIntroducido = escaner.nextInt();
	    
	    eraN = numeroIntroducido;
	    
	    while (eraN > 10) {
	      eraN /= 10;
	      numeroDeDigitos++;
	    }
	    
	    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " d�gito/s.");
	    escaner.close();

	}
}
