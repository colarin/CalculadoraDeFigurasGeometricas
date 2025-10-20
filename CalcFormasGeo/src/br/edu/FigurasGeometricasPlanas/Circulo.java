package br.edu.FigurasGeometricasPlanas;

import java.util.Scanner;

public class Circulo {
	public double raio;
	public double area;

	public void recebeRaio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
	}
	public void CalcArea(){
		area = 3.14 * Math.pow(raio, 2);
	}
	public void listaAtributos(){
		System.out.println("O valor do raio é " + raio);
		System.out.println("O valor da area do circulo é  " + area);
		System.out.println("-------------------------------------------");
	}
}
