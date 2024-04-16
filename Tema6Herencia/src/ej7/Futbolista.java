package ej7;

import java.util.Arrays;

public class Futbolista implements Comparable<Futbolista> {

	private int numCamiseta;

	private int numGoles;

	private int edad;

	private String nombre;

	public Futbolista(int numCamiseta, int numGoles, int edad, String nombre) {
		super();
		if (numCamiseta > 0 && numCamiseta < 100) {
			this.numCamiseta = numCamiseta;
		}
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
		if (edad > 0 && edad < 150) {
			this.edad = edad;
		}
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		Futbolista futbolista = (Futbolista) obj;

		if (futbolista.nombre.equals(this.nombre) && futbolista.numCamiseta == this.numCamiseta) {
			igual = true;
		}

		return igual;
	}

	@Override
	public String toString() {
		String cadena = "Futbolista \n";
		cadena += nombre + " : " + numCamiseta;
		cadena += "\n Goles Marcados :" + numGoles;
		cadena += "\n Edad: " + edad;
		return cadena;
	}

	@Override
	public int compareTo(Futbolista o) {
		int res =0;
		
		if(this.numCamiseta>o.numCamiseta) {
			res=1;
		}
		else if(this.numCamiseta<o.numCamiseta){
			res=-1;
		}else {
			res=this.nombre.compareTo(o.nombre);
		}
		
		return 0;
	}
	
	

}
