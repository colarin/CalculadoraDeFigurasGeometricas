package br.edu.FigurasGeometricasPlanas;

import java.util.Scanner;

public class Quadrado {
	public double L;
	public double area;
	
	public void recebeLado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do lado do quadrado: ");
		L = sc.nextDouble();
	}
	public void calcArea(){
		area = Math.pow(L, 2);
	}
	public void listaAtributos(){
		System.out.println("O valor do lado do quadrado é " + L);
		System.out.println("O valor da area do quadrado é " + area);
		System.out.println("-------------------------------------------");
	}
}
