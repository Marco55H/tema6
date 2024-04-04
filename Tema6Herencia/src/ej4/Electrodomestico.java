package ej4;

public class Electrodomestico {

	protected double precioBase = 100;

	protected enum Color {
		BLANCO, NEGRO, AZUL, ROJO, GRIS
	};

	protected enum ConsumoEnergético {
		A, B, C, D, E, F
	};

	protected int peso = 5;

	protected Color color = BLANCO;

	protected char consumoEnergético = 'F';

	public Electrodomestico(double precioBase, int peso, String color, char consumoEnergético) {
		super();
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (precioBase > 0) {
			this.peso = peso;
		}
		if (color.equals(Color.valueOf(color))) {
			this.color = Color.valueOf(color);
		}

		if (consumoEnergético.valueOf(consumoEnergético))) {

		this.consumoEnergético = consumoEnergético.valueOf(consumoEnergético);
	}

}
