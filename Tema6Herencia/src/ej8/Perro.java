package ej8;

import java.util.Random;

public class Perro extends AnimalDoméstico{

	public Perro(String nombre, String raza, String color, double peso) {
		super(nombre, raza, color, peso);
	}

	static Random r = new Random();

	@Override
	public boolean hacerCaso() {
		int porcentaje;
		boolean caso=false;
		
		porcentaje=r.nextInt(0,101);
		
		if (porcentaje<91) {
			caso=true;
		}
		return caso;
	}

	@Override
	public void hacerRuido() {
		System.out.println("GUAU");
		
	}

	public void sacarPaseo(){
		System.out.println("Paseado");
	}
	
	
}
