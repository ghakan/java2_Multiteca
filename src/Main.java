package com.zubiri.multiteca;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int seleccion=0;
		do {
			try{
				//Visualiza por terminal las opciones del menu
				System.out.println("Mostrar Multiteca---------------------------1");
				System.out.println("Introducir Obras----------------------------2");
				System.out.println("SALIR DEL PROGRAMA--------------------------3");
				   
				seleccion = sc.nextInt();
				switch (seleccion) {
					
					case 1: //Mostrar Multiteca
						Multiteca.leerMultiteca("multiteca.txt");
						break;
						
					case 2: //Introducir Obras
						Multiteca.insertarObras();
						break;
					case 3: //Salimos
						break;
					default:
						System.out.println("No ha insertado la opcion correcta");
				}
			}catch(InputMismatchException e){
				System.out.println("No ha insetado un numero ");
				sc.nextLine();	
			}
		} while (seleccion != 3);
		System.out.println("Gracias por usar nuestro programa. Que tenga un buen día!");
		sc.close();
	}
}
