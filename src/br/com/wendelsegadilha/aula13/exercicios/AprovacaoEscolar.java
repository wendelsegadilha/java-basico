package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class AprovacaoEscolar {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		double nota01, nota02, nota03, nota04, media;
		
		System.out.println("Informe as 4 notas para calacular a média: ");
		nota01 = scan.nextDouble();
		nota02 = scan.nextDouble();
		nota03 = scan.nextDouble();
		nota04 = scan.nextDouble();
		media = (nota01 + nota02 + nota03 + nota04) / 4.0;
		
		if(media >= 7){
			System.out.println("Aluno aprovado! Média = " + media);
		}else if (media > 5 && media < 7){
			System.out.println("Aluno de recuperação! Média = " + media);
		}else{
			System.out.println("Aluno reprovado! Média = " + media);
		}
		
		
	
	}

}
