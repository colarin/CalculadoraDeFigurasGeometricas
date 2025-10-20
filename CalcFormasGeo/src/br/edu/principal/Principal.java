package br.edu.principal;
import br.edu.FigurasGeometricasPlanas.*;
public class Principal {

	public static void main(String[] args) {
		Triangulo obj1 = new Triangulo();
		obj1.recebeAltura();
		obj1.recebeBase();
		obj1.calcArea();
		obj1.listaAtributos();
		
		Quadrado obj2 = new Quadrado();
		obj2.recebeLado();
		obj2.calcArea();
		obj2.listaAtributos();
		
		Retangulo obj3 = new Retangulo();
		obj3.recebeAltura();
		obj3.recebeBase();
		obj3.CalcArea();
		obj3.listaAtributos();
		
		Circulo obj4 = new Circulo();
		obj4.recebeRaio();
		obj4.CalcArea();
		obj4.listaAtributos();
		
		Trapezio obj5 = new Trapezio();
		obj5.recebeAltura();
		obj5.recebeBaseMaior();
		obj5.recebeBaseMenor();
		obj5.CalcArea();
		obj5.listaAtributos();
		
		Paralelograma obj6 = new Paralelograma();
		obj6.recebeAltura();
		obj6.recebeBase();
		obj6.CalcArea();
		obj6.listaAtributos();
		
		Pentagono obj7 = new Pentagono();
		obj7.recebeLado();
		obj7.recebeRaio();
		obj7.calcArea();
		obj7.listaAtributos();
		
		Losango obj8 = new Losango();
		obj8.receberDiagonalmaior();
		obj8.receberDiagonalmenor();
		obj8.calcArea();
		obj8.listaAtributos();
		
		Hexagono obj9 = new Hexagono();
		obj9.recebeLado();
		obj9.calcArea();
		obj9.listaAtributos();
	}

}
