package br.com.wendelsegadilha.aula12;

import java.util.Scanner;

public class LeituraDadosTecladoInline {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo, sua idade, seu sal�rio, quantidade de filhos e se tem bichinhos de estima��o:");
		String nomeCompleto = scan.nextLine();
		byte idade = scan.nextByte();
		double salario = scan.nextDouble();
		short qtdFilhos = scan.nextShort();
		boolean temPet = scan.nextBoolean();
		
		
		System.out.println("Seu nome � " + nomeCompleto);
		System.out.println("Sua idade � " + idade + " anos");
		System.out.println("Seu sal�rio � R$ " + salario);
		System.out.println("Voc� tem " + qtdFilhos + " filhos");
		System.out.println("Tem pet ? " + temPet);

	}

}
