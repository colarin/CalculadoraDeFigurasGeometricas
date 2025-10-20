package br.edu.FigurasGeometricasPlanas;

import java.util.Scanner;

public class Pentagono {
	public double lado;
	public double raio;
	public double area;
	
	public void recebeLado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do lado do pentagono: ");
		lado = sc.nextDouble();
	}
	public void recebeRaio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio do pentagono: ");
		raio = sc.nextDouble();
	}
	public void calcArea() {
		area = 1/2 * lado * raio;
	}
	public void listaAtributos() {
		System.out.println("O valor do lado do pentago é: " + lado);
		System.out.println("O valor do raio do pentago é: " + raio);
		System.out.println("O valor da area do pentago é: " + area);
		System.out.println("-------------------------------------------");
	}
}
