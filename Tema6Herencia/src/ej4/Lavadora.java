package ej4;

public class Lavadora extends Electrodomestico {

	private int carga = 5;

	public Lavadora(double precioBase, int peso, Color color, ConsumoEnergético consumoEnergético, int carga) {
		super(precioBase, peso, color, consumoEnergético);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public Lavadora() {
		super();
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	protected void precioFinal() {
		super.precioFinal();
		if (this.carga < 30) {
			this.precioBase += 10;
		}
	}
	
	public String toString() {
		String cadena = super.toString();
		cadena += "Lavadora--> ";
		cadena += "Carga " + this.carga;
		cadena += "Precio " + this.precioBase;
		return cadena;
	}
}
