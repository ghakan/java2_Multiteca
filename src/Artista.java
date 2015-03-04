package com.zubiri.multiteca;
import java.util.Scanner;

public class Artista {

	private String nombre;
	private int anoNacimiento;

	public Artista(String nombre, int anoNacimiento) {
	
		this.nombre = nombre;
		this.anoNacimiento = anoNacimiento;
	}

	public Artista(String artista, String separador) {
		
		String[] separados = artista.split(separador);
		setNombre(separados[0]);
		setAnoNacimiento(Integer.parseInt(separados[1]));
	}

	public Artista (Scanner sc){
		System.out.println("NOMBRE: ");
		setNombre(sc.next());	
		System.out.println("AÑO DE NACIMIENTO: ");
		setAnoNacimiento(sc.nextInt());
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getAnoNacimiento() {
		
		return anoNacimiento;
	}

	public void setAnoNacimiento(int anoNacimiento) {
		
		this.anoNacimiento = anoNacimiento;
	}
	public String formattedArtista() {
		
		String formattedObra=
			"\nAutor: "+this.nombre
			+" Año de Nacimiento: "+this.anoNacimiento;
		return formattedObra;
	}
	
}
