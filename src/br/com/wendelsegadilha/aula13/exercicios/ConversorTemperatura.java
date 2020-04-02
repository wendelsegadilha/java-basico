package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class ConversorTemperatura {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		int temperatura = scan.nextInt();
		
		temperatura = (5 * (temperatura - 32) / 9);
		System.out.println("Temperatura: " + temperatura + " °C");
		
		/*
		 * Para converter de forma inversa (converter celsius para fahrenheit)
		 * (0 °C × 9/5) + 32
		 * 
		 * */

	}

}
