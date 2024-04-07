package ej4;

public class Main {
	public static void main(String[] args) {
		Lavadora lava = new Lavadora(45, 25);
		Television tv = new Television(2000, 30);

		Array.añadirObjeto(lava);
		Array.añadirObjeto(tv);

		Array.precioClases();
	}
}
