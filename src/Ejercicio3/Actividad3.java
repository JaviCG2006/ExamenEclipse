package Ejercicio3;

import java.util.Scanner;

public class Actividad3 {
	public static void main (String[] args) {
		var sc = new Scanner (System.in);
		
		Producto[] producto = new Producto[100];
		
		for(int i = 0; i < producto.length; i++) {
			Producto[] productos = new Producto[i];
		}
		
		System.out.println("1. Introducir datos nuevo inventario");
		System.out.println("2. Nuevo producto");
		System.out.println("3. Buscar producto y modificar información");
		System.out.println("4. Eliminar producto");
		System.out.println("5. Mostrar valor total del inventario");
		System.out.println("6. Informe rotura de Stock");
		System.out.println("7. Salir");
		int elección = sc.nextInt();
		
		switch(elección) {
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			
			default: System.out.println("El numero fue escrito incorrectamente");
		}
	}
}