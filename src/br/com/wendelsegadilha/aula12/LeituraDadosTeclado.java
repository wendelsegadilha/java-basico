package br.com.wendelsegadilha.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		
		System.out.println("Digite seu salário:");
		double salario = scan.nextDouble();
		
		System.out.println("Seu nome é " + nomeCompleto);
		System.out.println("Sua idade é " + idade + " anos");
		System.out.println("Seu salário é R$" + salario);

	}

}
