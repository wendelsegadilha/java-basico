package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class CalculaSalarioMes {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha por m�s? ");
		int horasMes = scan.nextInt();
		
		double salario = ganhoHora * horasMes;
		System.out.println("Seu sal�rio �: " + salario);
		
		
		

	}

}
