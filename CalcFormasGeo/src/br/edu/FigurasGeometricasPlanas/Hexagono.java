package br.edu.FigurasGeometricasPlanas;

import java.util.Scanner;

	public class Hexagono {
		public double L;
		public double area;
		
		public void recebeLado() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o valor do lado do hexagono: ");
			L = sc.nextDouble();
		}
		public void calcArea() {
			area = (3 * Math.pow(L, 2) * Math.sqrt(3))/2;
		}
		
		public void listaAtributos() {
			System.out.println("O valor do lado do hexagono é " + L);
			System.out.println("O valor da area do hexagono é " + area);
			System.out.println("-------------------------------------------");
		}
}
