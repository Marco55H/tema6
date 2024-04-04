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

	protected Color color = Color.BLANCO;

	protected ConsumoEnergético consumoEnergético = ConsumoEnergético.F;

	public Electrodomestico(double precioBase, int peso, Color color, ConsumoEnergético consumoEnergético) {
		super();
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
		if (color.equals(color)) {
			this.color = (color);
		}

		if (consumoEnergético.equals(consumoEnergético)) {

			this.consumoEnergético = consumoEnergético;
		}
	}

	public Electrodomestico(double precioBase, int peso) {
		super();

		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico() {
		super();
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public int getPeso() {
		return peso;
	}

	public Color getColor() {
		return color;
	}

	public ConsumoEnergético getConsumoEnergético() {
		return consumoEnergético;
	}

	private void comprobarConsumoEnergetico(char letra) {

		String letron = String.valueOf(letra);
		letron.toUpperCase();
		switch (letron) {
		case "A":
			this.consumoEnergético = ConsumoEnergético.valueOf(letron);
			break;
		case "B":
			this.consumoEnergético = ConsumoEnergético.valueOf(letron);
			break;
		case "C":
			this.consumoEnergético = ConsumoEnergético.valueOf(letron);
			break;
		case "D":
			this.consumoEnergético = ConsumoEnergético.valueOf(letron);
			break;
		case "E":
			this.consumoEnergético = ConsumoEnergético.valueOf(letron);
			break;
		case "F":
			this.consumoEnergético = ConsumoEnergético.valueOf(letron);
			break;
		}

	}

	private void comprobarColor(String color) {
		switch (color) {
		case "GRIS":
			this.color = Color.valueOf(color);
			break;
		case "ROJO":
			this.color = Color.valueOf(color);
			break;
		case "BLANCO":
			this.color = Color.valueOf(color);
			break;
		case "NEGRO":
			this.color = Color.valueOf(color);
			break;
		case "AZUL":
			this.color = Color.valueOf(color);
			break;
		}
	}

	protected void precioFinal() {

		if (this.peso < 20) {
			precioBase += 10;
		} else if (this.peso < 50) {
			precioBase += 50;
		} else if (this.peso < 80) {
			precioBase += 80;
		} else {
			precioBase += 100;
		}

		if (this.consumoEnergético == ConsumoEnergético.F) {
			precioBase += 10;
		} else if (this.consumoEnergético == ConsumoEnergético.E) {
			precioBase += 30;
		} else if (this.consumoEnergético == ConsumoEnergético.D) {
			precioBase += 50;
		} else if (this.consumoEnergético == ConsumoEnergético.C) {
			precioBase += 60;
		} else if (this.consumoEnergético == ConsumoEnergético.B) {
			precioBase += 80;
		} else {
			precioBase += 100;
		}
	}

	public String toString() {
		String cadena = "Electrodomestico--> \n";
		cadena +="Precio" +this.precioBase;
		cadena += "\n Peso " + this.peso;
		cadena += "\n Consumo Energético " + this.consumoEnergético  ;
		cadena += "\n Color "+this.color + "\n";
		return cadena;
	}

}