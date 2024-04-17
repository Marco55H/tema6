package ej8;

import java.util.Random;

public class Gato extends AnimalDoméstico{

	static Random r = new Random();
	
	public Gato(String nombre, String raza, String color, double peso) {
		super(nombre, raza, color, peso);
	}

	@Override
	public boolean hacerCaso() {
		int porcentaje;
		boolean caso=false;
		
		porcentaje=r.nextInt(0,101);
		
		if (porcentaje<6) {
			caso=true;
		}
		return caso;
	}

	@Override
	public void hacerRuido() {
		System.out.println("MIAU");
		
	}

	public void toserBolaPelo(){
		System.out.println("Ha 	tosido una bola de pelo");
	}
	
}
