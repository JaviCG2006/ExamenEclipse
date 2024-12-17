package Ejercicio1;

import java.util.*;

public class Actividad1 {
	
	public static void main (String[] args) {
		var sc = new Scanner (System.in);
		int contador = 0;
		char contadorletras = 0; 
		String MayorLongitud;
		String MenorLongitud;
		
		System.out.println("Introduzca una frase por teclado");
		String frase = sc.nextLine().trim();
		
		for (int i = 0 ; i < frase.length(); i++) {
			if(Character.isWhitespace(frase.charAt(i))){
				contador++;
				
			} else if(Character.isLetter(frase.charAt(i))) {
				contadorletras++;
			}
		}
		
		System.out.println("La palabra contiene " + contadorletras + "letras");
		System.out.println("La palabra contiene " + contadorletras + "espacios");
		
	}
}