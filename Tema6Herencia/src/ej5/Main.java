package ej5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Poligono[] figuras = new Poligono[10];
	static int contadorArray = 0;

	public static void main(String[] args) {
		int opc;
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;

		menu();
		System.out.println("Introduce la opción");
		opc = sc.nextInt();
		do {

			switch (opc) {
			case 1:
				System.out.println("Introduce el lado 1");
				lado1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce el lado 2");
				lado2 = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce el lado 3");
				lado3 = sc.nextInt();
				sc.nextLine();

				Triangulo tr = new Triangulo(lado1, lado2, lado3);
				if (contadorArray < 9) {
					añadeFigura(tr);
				} else {
					System.out.println("Array completo");
				}

				break;
			case 2:

				System.out.println("Introduce el lado 1");
				lado1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce el lado 2");
				lado2 = sc.nextInt();
				sc.nextLine();

				Rectangulo rt = new Rectangulo(lado1, lado2);
				if (contadorArray < 9) {
					añadeFigura(rt);
				} else {
					System.out.println("Array completo");
				}

				break;
			case 3:

				System.out.println(Arrays.toString(figuras));
				break;
			}
			menu();
			System.out.println("Introduce la opción");
			opc = sc.nextInt();
		} while (contadorArray < 9);

		sc.close();
	}

	private static void menu() {
		System.out.println("1. Introducir triángulo.\r\n" + "2. Introducir rectángulo.\r\n"
				+ "3. Mostrar contenido del array.\r\n");
	}

	private static void añadeFigura(Poligono pol) {
		figuras[contadorArray] = pol;
		contadorArray++;
	}
}
