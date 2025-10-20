package br.edu.FigurasGeometricasPlanas;

import java.util.Scanner;

public class Paralelograma {
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
	public void CalcArea(){
		area = base * altura;
	}
	public void listaAtributos() {
		System.out.println("A base do paralelograma é: " + base);
		System.out.println("A altura do paralelograma é: " + altura);
		System.out.println("A area do paralelograma é: " + area);
		System.out.println("-------------------------------------------");
	}
}
