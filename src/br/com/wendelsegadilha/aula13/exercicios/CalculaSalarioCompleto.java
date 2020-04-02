package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class CalculaSalarioCompleto {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha por m�s? ");
		int horasMes = scan.nextInt();
	
		
		double salarioBruto = ganhoHora * horasMes;
		System.out.println("Sal�rio Bruto: " + salarioBruto);
		
		double descontoINSS = ( 8.0/100 * salarioBruto);
		System.out.println("Desconto INSS: " + descontoINSS);
		
		double descontoSind = (0.05 * salarioBruto);
		System.out.println("Desconto Sindicato: " + descontoSind);
		
		double ir = (0.11 * salarioBruto);
		
		double salarioLiquido = salarioBruto - ir - descontoINSS - descontoSind;
		System.out.println("Sal�rio Liquido: " + salarioLiquido);
		
		
		

	}

}
