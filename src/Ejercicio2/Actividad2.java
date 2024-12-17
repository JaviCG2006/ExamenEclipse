package Ejercicio2;

import java.util.Scanner;

public class Actividad2 {
	
	public static void main (String[] args) {
		var sc = new Scanner (System.in);
		
		int entradasPrincipal = 1000;
		int entradasPlatea = 200;
		int entradasVip = 25;
		int entradasTotal = entradasPrincipal + entradasPlatea + entradasVip;
		boolean salir = true;
		int eleccion;
		int elección;
		
		do {
			System.out.println("----Menu:");
			System.out.println("1: Muestra número de entradas libres");
			System.out.println("2: Vender entradas");
			System.out.println("3: Salir");
			
			System.out.println("Elige que quieres hacer");
			eleccion = sc.nextInt();
			
			switch(eleccion) {
			
			case 1:
				System.out.println("El numero total de entradas es de " +  entradasTotal);
				System.out.println("El numero de entradas principales son: " + entradasPrincipal);
				System.out.println("El numero de entradas platea son: " + entradasPlatea);
				System.out.println("El numero de entradas vip son: " + entradasVip);
				salir = false;
				
			case 2:
				System.out.println("\nQue entrada quieres comprar");
				System.out.println("4. Para comprar entrada en zona principal");
				System.out.println("5. Para comprar en zona Platea");
				System.out.println("6. Para comprar en zona vip");
				System.out.println("7. Salir");
				elección = sc.nextInt();
				
				switch(elección) {
				case 4:
					System.out.println("¿Cuantas entradas quieres?");
					int cant = sc.nextInt();
					if (cant > entradasPrincipal) {
						System.out.println("Entradas agotadas");
						System.out.println("Nos quedan " + entradasPrincipal);
					} else {
						System.out.println("La entrada fue comprada existosamente");
						 entradasPrincipal =  entradasPrincipal - cant;
					}salir = false;
					
				case 5:
					System.out.println("¿Cuantas entradas quieres?");
					int canti = sc.nextInt();
					if (canti > entradasPlatea) {
						System.out.println("Entradas agotadas");
						System.out.println("Nos quedan " + entradasPlatea);
					} else {
						System.out.println("La entrada fue comprada existosamente");
						entradasPlatea =  entradasPlatea - canti;
					}salir = false;
				case 6:
					System.out.println("¿Cuantas entradas quieres?");
					int cantid = sc.nextInt();
					if (cantid > entradasPlatea) {
						System.out.println("Entradas agotadas");
					} else {
						System.out.println("La entrada fue comprada existosamente");
						entradasPlatea =  entradasPlatea - cantid;
					}salir = false;
					
				case 7:
					salir = true;
				}
			case 3: 
				salir = true;
			}
			
		}while(!salir);
	}
}