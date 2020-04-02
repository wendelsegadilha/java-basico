package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class CalculaAreaCirculo {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		double raio, area;
		
		System.out.println("Informe o Raio do Círculo: ");
		raio = scan.nextDouble();
		
		/*
		 * Para calcular a área do círculo devemos utilizar a seguinte fórmula:
			A = π . r2
			Onde,
			π: constante Pi (3,14)
			r: raio
		 * */
		
		area = 3.14 * (raio * raio);
		System.out.println("Area = " + area);
		
	}

}
