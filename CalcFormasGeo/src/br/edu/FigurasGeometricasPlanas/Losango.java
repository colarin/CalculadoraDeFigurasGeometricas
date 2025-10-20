package br.edu.FigurasGeometricasPlanas;

import java.util.Scanner;

public class Losango {
	public double diagonalmaior;
	public double diagonalmenor;
	public double area;
	
	public void receberDiagonalmaior() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da diagonal maior do losangulo: ");
		diagonalmaior = sc.nextDouble();
	}
	public void receberDiagonalmenor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da diagonal menor do losangulo: ");
		diagonalmenor = sc.nextDouble();
	}
	public void calcArea() {
		area = (diagonalmaior * diagonalmenor)/2;
	}
	public void listaAtributos() {
		System.out.println("O valor da diagonal maior é: " + diagonalmaior);
		System.out.println("O valor da diagonal menor é: " + diagonalmenor);
		System.out.println("O valor da area é: " + area);
		System.out.println("-------------------------------------------");
	}
}
