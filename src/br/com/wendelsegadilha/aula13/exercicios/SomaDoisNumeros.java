package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class SomaDoisNumeros {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int valor01, valor02;
		
		System.out.println("Informe o valor 01:");
		valor01 = scan.nextInt();
		
		System.out.println("Informe o valor 02:");
		valor02 = scan.nextInt();
		
		System.out.println(valor01 + valor02);

	}

}
