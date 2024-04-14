package ej6;

public class Control {

	public static void main(String[] args) {
		
	
	Socio P1 = new Socio(42, "Marco", 18);
	Sociedad.añadir(P1);
	Socio P2 = new Socio(3, "Luis", 56);
	Sociedad.añadir(P2);
	Socio P3 = new Socio(565, "Laura", 44);
	Sociedad.añadir(P3);
	Socio P4 = new Socio(15, "Daniel", 34);
	Sociedad.añadir(P4);
	Socio P5 = new Socio(22, "Carlos", 22);
	Sociedad.añadir(P5);
	
	Sociedad.imprimirArray();
}
}
