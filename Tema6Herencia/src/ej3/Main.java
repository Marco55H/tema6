package ej3;

public class Main {
	public static void main(String[] args) {

		ProductoNoPerecedero PNP = new ProductoNoPerecedero("Botella", 12, "Refresco");

		System.out.println("3 Botellas son" + PNP.calcular(3));

		System.out.println(PNP);
		
		ProductoPerecedero PP = new ProductoPerecedero("Leche", 12, 2);
		
		System.out.println("5 Leches son "  + PP.calcular(5));
		
		System.out.println(PP);

	}
}
