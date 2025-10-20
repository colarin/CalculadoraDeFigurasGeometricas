package br.edu.FigurasGeometricasPlanas;

import java.util.Scanner;

public class Trapezio {
	public double basemaior;
	public double basemenor;
	public double altura;
	public double area;
	
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Altura: ");
		altura = sc.nextDouble();
	}
	public void recebeBaseMaior() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Base maior: ");
		basemaior = sc.nextDouble();
	}
	public void recebeBaseMenor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Base menor: ");
		basemenor = sc.nextDouble();
	}
	public void CalcArea() {
		area = ((basemaior + basemenor)*altura)/2;
	}
	public void listaAtributos() {
		System.out.println("A base maior do trapezio é: " + basemaior);
		System.out.println("A base menor do trapezio é: " + basemenor);
		System.out.println("A altura do trapezio é: " + altura);
		System.out.println("A area do trapezio é: " + area);
		System.out.println("-------------------------------------------");
	}
}