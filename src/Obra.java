package com.zubiri.multiteca;
import java.util.Scanner;
import java.util.ArrayList;

public class Obra {
	
	private String titulo;
	private Artista autor;
	private int anoEdicion;
	
	public Obra (String lineaObra, String separador) {
		
		String[] separados = lineaObra.split(separador);
		if (separados[0].equalsIgnoreCase("libro")) {
			
			Artista autor = new Artista(separados[2],";");
			Libro libro = new Libro(separados[1],autor,Integer.parseInt(separados[3]),separados[4],Integer.parseInt(separados[5]));
			
		}else if(separados[0].equalsIgnoreCase("disco")) {
			
			Artista autor = new Artista(separados[2],";");
			Disco disco = new Disco(separados[1],autor,Integer.parseInt(separados[3]),separados[4],Integer.parseInt(separados[5]));
			
		}else if(separados[0].equalsIgnoreCase("pelicula")) {
			
			Artista autor = new Artista(separados[2],";");
			
			ArrayList<Artista> al_interpretes = new ArrayList<Artista>();
			String[] interpretes = separados[5].split("#");
			for (int i=0;i<interpretes.length;i++){
				
				Artista interprete = new Artista(interpretes[i],";");
				al_interpretes.add(interprete);
			}
			
			Pelicula pelicula = new Pelicula(separados[1],autor,Integer.parseInt(separados[3]),separados[4],al_interpretes);
		}
	}
	//Constructor que recibe en forma de String las propiedades separadas entre si por el caracter '#'.
	public Obra(String titulo, Artista autor, int anoEdicion, String separator) {
		System.out.println("*********** Introducción de datos ************");
		System.out.println("TITULO: ");		
		setTitulo(sc.next());
		System.out.println("AUTOR: ");
		Artista autor = new Artista(sc);
		setAutor(autor);
		System.out.println("AÑO DE EDICION: ");			
		setAnoEdicion(sc.nextInt());

	}
	public Obra(String titulo, Artista autor, int anoEdicion) {
	
		setTitulo(titulo);
		setAutor(autor);
		setAnoEdicion(anoEdicion);
	}
	
	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getAnoEdicion() {
		
		return anoEdicion;
	}

	public void setAnoEdicion(int anoEdicion) {
		
		this.anoEdicion = anoEdicion;
	}

	public String getTitulo() {
		
		return titulo;
	}
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}
	
	@Override public String formattedObra() {
		String formattedObra = 
		"TITULO Y AUTOR:" +	this.titulo + " " + this.autor + "\n" 
		+"AÑO DE EDICION:" + this.anoEdicion;
		
		return formattedObra;
	}
}