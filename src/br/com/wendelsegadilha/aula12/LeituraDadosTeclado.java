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
		
		System.out.println("Digite seu sal�rio:");
		double salario = scan.nextDouble();
		
		System.out.println("Seu nome � " + nomeCompleto);
		System.out.println("Sua idade � " + idade + " anos");
		System.out.println("Seu sal�rio � R$" + salario);

	}

}
