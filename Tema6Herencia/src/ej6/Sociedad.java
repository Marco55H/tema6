package ej6;

public class Sociedad {
 public static Socio[] array = new Socio[5];
 
 public static void añadir(Socio p) {
	 boolean añadido = false;
	 int i=0;
	 while(añadido=false && i<array.length) {
		 if(array[i]==null) {
			 
			 array[i]=p;
		 }
	 }
 }
 
 
 public static void imprimirArray() {
	 boolean añadido = false;
	 for (int i= 0; i<array.length;i++)
		 if(array[i]!=null) {
			 System.out.println(array[i]);
		 }
	 }
 }
