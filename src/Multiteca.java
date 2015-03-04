package com.zubiri.multiteca;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Multiteca {
	
	private static ArrayList<Obra> multiteca = new ArrayList<Obra>();
	private static int numObras = 0;

	public leerMultiteca(String fichero) {
		String linea;
		FileInputStream f;
	    InputStreamReader fr;
	    BufferedReader br;
	    
	    f = new FileInputStream(fichero);
    	fr = new InputStreamReader(f, "UTF8");
    	br = new BufferedReader(fr);
    	linea = br.readLine();
			if (linea == null) {
				System.out.println("No existen distribuidores en el fichero");
			}
			while ((linea != null) && (linea.compareTo("") != 0)) {
				Obra obra = new Obra(linea,","); //tengo que poner bien el separador
				addObra(obra);
				linea = br.readLine();
			}
			br.close();
	}

	public static void insertarObras() {
		Scanner sc = new Scanner(System.in);
		int seleccion=0;
		do{
			try{
				System.out.println("¿Cuantas obras quieres insertar? ");
				seleccion = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("No ha insetado un numero ");
				sc.nextLine();
			}
		}while(seleccion<0);
		
		for (int i = 0; i < seleccion; i++) {
			try{
				System.out.println("¿Qué obra quieres insertar?");
				System.out.println("Disco:--------------------1");
				System.out.println("Pelicula:-----------------2");
				System.out.println("Libro:--------------------3");
			    
				switch(sc.nextInt()) {
					case 1:
						Disco disco = new Disco(sc);
						multiteca.add(disco);
						break;
					case 2:
						Pelicula pelicula = new Pelicula(sc);
						multiteca.add(pelicula);
						break;
					case 3:
						Libro libro = new Libro(sc);
						multiteca.add(libro);
						break;
					default:
						System.out.println("No ha insertado la opción correcta.");
						break;
				}
			}catch(InputMismatchException e){
				System.out.println("No ha insetado un numero ");
				sc.nextLine();
			}
		}
	}

	public Multiteca(ArrayList<Obra> obras) {
		setMultiteca(obras);
	}
	
	public void setMultiteca(ArrayList<Obra> obras) {
		
		this.multiteca = obras; //
	}
	
	public ArrayList<Obra> getMultiteca() {
		this.multiteca = multiteca; //
	}
	
	public void addObra(Obra obra) {
		multiteca.add(obra);
		numObras++;
	}
	
	public Obra obtainObra(int index) {
		return multiteca.get(index);
	}
	
	public static int counter() {
		return numObras;
	}
	
	public String formattedMultiteca() {
		String formattedObra = 
		"Multiteca... :"  + "\n" + " Numero de Obras " + this.numObras;
		return formattedMultiteca; //
	}
}
