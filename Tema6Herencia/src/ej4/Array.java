package ej4;

public class Array {

	static Electrodomestico[] electrodomesticos = new Electrodomestico[10];

	public static void añadirObjeto(Electrodomestico electro) {
		int i = 0;
		boolean nulo = false;
		while (i < electrodomesticos.length && nulo == false) {

			if (electrodomesticos[i] == null) {
				electrodomesticos[i] = electro;
				nulo = true;
			}
			i++;
		}

	}

	private static int calculaPrecio(Electrodomestico electro) {
		int i = 0;
		int precioTotal=0;
		boolean nulo = false;
		while (i < electrodomesticos.length && nulo != false) {

			if (electrodomesticos[i] != null) {
				if (electro instanceof Lavadora) {
					precioTotal += Lavadora.precioFinal();
				} else if (electro instanceof Television) {
					precioTotal += Television.precioFinal();
				} else if (electro instanceof Electrodomestico) {
					precioTotal += Electrodomestico.precioFinal();
				}
			}
			i++;
		}
		return precioTotal;
	}
	
	private static void precioClases(Electrodomestico electro) {
		int i = 0;
		int precioLavadora=0;
		int precioTele=0;
		int precioElectrodomestico=0;
		boolean nulo = false;
		while (i < electrodomesticos.length && nulo != false) {

			if (electrodomesticos[i] != null) {
				if (electro instanceof Lavadora) {
					precioLavadora += Lavadora.precioFinal();
				} else if (electro instanceof Television) {
					precioTele += Television.precioFinal();
				} else if (electro instanceof Electrodomestico) {
					precioElectrodomestico += Electrodomestico.precioFinal();
				}
			}
			i++;
		}
		System.out.println("Precio Lavadoras: "+precioLavadora);
		System.out.println("Precio Televisiones: "+precioTele);
		System.out.println("Precio Electrodomestico: "+precioElectrodomestico);
	}
	
}
