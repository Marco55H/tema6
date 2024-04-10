package ej5;

public abstract class Poligono {
	protected static int numeroLados = 0;

	public Poligono(int numeroLados) {
		super();
		if (numeroLados > 1 && numeroLados < 4) {
			this.numeroLados = numeroLados;
		}
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	abstract double area();

	@Override
	public String toString() {
		String cadena = "";
		cadena = "Número de lados= " + numeroLados;
		return cadena;
	}

}
