package br.com.wendelsegadilha.aula12;

import java.util.Scanner;

public class LeituraDadosTecladoInline {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo, sua idade, seu salário, quantidade de filhos e se tem bichinhos de estimação:");
		String nomeCompleto = scan.nextLine();
		byte idade = scan.nextByte();
		double salario = scan.nextDouble();
		short qtdFilhos = scan.nextShort();
		boolean temPet = scan.nextBoolean();
		
		
		System.out.println("Seu nome é " + nomeCompleto);
		System.out.println("Sua idade é " + idade + " anos");
		System.out.println("Seu salário é R$ " + salario);
		System.out.println("Você tem " + qtdFilhos + " filhos");
		System.out.println("Tem pet ? " + temPet);

	}

}
