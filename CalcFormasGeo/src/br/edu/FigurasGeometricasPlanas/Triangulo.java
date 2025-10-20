package br.edu.FigurasGeometricasPlanas;

import java.util.Scanner;

public class Triangulo {
		//atributo
		public double base;
		public double altura;
		public double area;
		
		//metodos
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
		public void retornaBase() {
			System.out.println("A base do tringul é: " + base);
		}
		public void retornaAltura() {
			System.out.println("A altura do tringul é: " + altura);
		}
		public void retornaArea() {
			System.out.println("A area do tringul é: " + area);
		}
		public void calcArea() {
			area = (base * altura)/2;
		}
		public void listaAtributos() {
			System.out.println("A base do tringulo é: " + base);
			System.out.println("A altura do tringulo é: " + altura);
			System.out.println("A area do tringulo é: " + area);
			System.out.println("-------------------------------------------");
		}
}