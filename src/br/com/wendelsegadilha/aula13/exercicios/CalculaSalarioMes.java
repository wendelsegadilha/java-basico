package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class CalculaSalarioMes {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês? ");
		int horasMes = scan.nextInt();
		
		double salario = ganhoHora * horasMes;
		System.out.println("Seu salário é: " + salario);
		
		
		

	}

}
