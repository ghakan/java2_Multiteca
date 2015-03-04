package com.zubiri.multiteca;
import java.util.Scanner;

public class Disco extends Obra{
	
	private String discografia;
	private int nCanciones;
	
	public Disco(String titulo, Artista autor, int anoEdicion, String discografia, int nCanciones) {
		super(titulo,autor,anoEdicion);
		setDiscografica(discografica);
		setnCanciones(nCanciones);
		Multiteca.addObra(this);
	}

	public Disco (Scanner sc){
		super(sc);
		System.out.println("DISCOGRAFIA: ");
		setDiscografica(sc.next());
		System.out.println("Numero de CAnciones: ");
		setnCanciones(sc.nextInt());
		Multiteca.addObra(this);
	}
	
	public String getDiscografia() {
		
		return discografia;
	}
	
	public void setDiscografia(String discografia) {
		
		this.discografia = discografia;
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	
	@Override public String formattedObra() {
		String formattedObra = 
		"DISCOGRAFIA:" + this.discografia + "\n" +
	    "Numero de CAnciones: " + this.nCanciones;
		
		return formattedObra;
	}
}
