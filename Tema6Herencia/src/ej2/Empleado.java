package ej2;

public class Empleado {
	
	private String nombre = "";

	public Empleado(String nombre) {
		super();
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	@Override
	public String toString() {
		String cadena="Empleado " + nombre;
		return cadena;
	}
	
	

}
