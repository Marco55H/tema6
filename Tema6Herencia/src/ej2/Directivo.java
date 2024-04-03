package ej2;

public class Directivo extends Empleado {

	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		String cadena= super.toString();
		
		cadena+=" --> Directivo";
		
		return cadena;
	}
		
}
