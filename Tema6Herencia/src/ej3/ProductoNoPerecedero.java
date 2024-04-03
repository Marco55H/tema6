package ej3;

public class ProductoNoPerecedero extends Producto {

	private String tipo;

	public ProductoNoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);

		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	public double calcular(int cantProducto) {
		return super.calcular(cantProducto);
	}

	@Override
	public String toString() {
		String cadena=super.toString();
		
		return cadena + "[tipo=" + tipo + "]";
	}

	
}
