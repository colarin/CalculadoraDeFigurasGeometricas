package br.edu.FigurasGeometricasPlanas;

import java.util.Scanner;

public class Retangulo {
	public double base;
	public double altura;
	public double area;
	
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Altura: ");
		altura = sc.nextDouble();
	}
	public void recebeBase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
	}
	public void CalcArea() {
		area = base * altura;
	}
	public void listaAtributos() {
		System.out.println("A base do retangulo é: " + base);
		System.out.println("A altura do retangulo é: " + altura);
		System.out.println("A area do retangulo é: " + area);
		System.out.println("-------------------------------------------");
	}
}
