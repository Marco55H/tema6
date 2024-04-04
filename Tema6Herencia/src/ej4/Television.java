package ej4;

public class Television extends Electrodomestico {

	private int resolucion = 20;
	private boolean sintonizadorTDT = false;

	public Television(double precioBase, int peso, Color color, ConsumoEnergético consumoEnergético, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumoEnergético);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		if (sintonizadorTDT == false || sintonizadorTDT == true) {
			this.sintonizadorTDT = sintonizadorTDT;
		}
	}

	public Television(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Television() {
		super();
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	@Override
	protected void precioFinal() {
		super.precioFinal();
		if (this.resolucion < 40) {
			precioBase += precioBase*0.4;
		}
		
		if(sintonizadorTDT) {
			precioBase +=50;
		}
	}

	public String toString() {
		
		String cadena = super.toString();
		
		cadena += "Television--> ";
		cadena += "Resolución " + this.resolucion + "\n";
		if(this.sintonizadorTDT) {
			cadena += "Con sintonizador";
		}else {
			cadena += "Sin sintonizador";
		}
		cadena += "Precio  "+this.precioBase;
		return cadena;
	}
}
