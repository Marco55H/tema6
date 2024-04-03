package ej3;

public class Producto {

	protected String nombre;
	protected double precio;

	public Producto(String nombre, double precio) {
		super();

		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (precio > 0) {
			this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	
	public double calcular(int cantProducto) {
		double total = 0;
		
		total= cantProducto*this.precio;
		
		return total;
	}
	
	
	
	@Override
	public String toString() {
		String cadena = "";

		cadena =  nombre + "=" + precio;

		return cadena;
	}

}
