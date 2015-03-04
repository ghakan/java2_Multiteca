package com.zubiri.multiteca;
import java.util.Scanner;

public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas;
	
	public Libro(String titulo, Artista autor, int anoEdicion, String editorial, int numPaginas) {
		super(titulo,autor,anoEdicion);
		setEditorial(editorial);
		setNumPaginas(numPaginas);
		Multiteca.addObra(this);
	}
	public Libro (Scanner sc){
		super(sc);
		System.out.println("EDITORIAL: ");
		setEditorial(sc.next());
		System.out.println("Numero de Paginas: ");
		setNumPaginas(sc.nextInt());
		Multiteca.addObra(this);
	}
	
	public String getEditorial() {
		
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
	}
	
	public int getNumPaginas() {
		
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		
		this.numPaginas = numPaginas;
	}
	
	@Override public String formattedObra() {
		String formattedObra = 
		"EDITORIAL: " +	this.editorial + "\n" +
	    "Numero de paginas: " + this.numPaginas;
		
		return formattedObra;
		
	}

}
