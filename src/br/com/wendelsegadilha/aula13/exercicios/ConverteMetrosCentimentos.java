package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class ConverteMetrosCentimentos {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		double medida;
		
		System.out.println("Digite a medida em metros: ");
		medida = scan.nextDouble();
		
		medida = medida * 100;
		System.out.println("A medida vale " + medida + "cm");
	}

}
