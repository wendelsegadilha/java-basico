package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class AreaQuadrado {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int base, altura, area;
		
		System.out.println("Informe a base e a altura do quadrado: ");
		base = scan.nextInt();
		altura = scan.nextInt();
		
		area = base * altura;
		System.out.println("Area em dobro = " + 2 * area);
		

	}

}
