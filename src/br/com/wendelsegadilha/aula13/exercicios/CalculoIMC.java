package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class CalculoIMC {

	private static Scanner scan;

	public static void main(String[] args) {
		
		System.out.println(" == ÍNDICE DE MASSA CORPORAL (IMC) ==");
		
		scan = new Scanner(System.in);
		
		//recebendo os dados
		System.out.println("Informe seu peso (KG): ");
		double peso = scan.nextDouble();
		
		System.out.println("Informe seu altura (M): ");
		double altura = scan.nextDouble();
		
		//calculando o IMC
		double imc = (peso / (altura * altura));
		
		//efetuando os testes
		String msg = "";
		if(imc < 20){
			msg = "Abaixo do peso.";
		}else if(imc >= 20 && imc < 25){
			msg = "Peso ideal.";
		}else if(imc >= 25 && imc < 30){
			msg = "Sobrepeso.";
		}else if(imc >= 30 && imc < 35){
			msg = "Obesidade moderda.";
		}else if(imc >= 35 && imc < 40){
			msg = "Obesidade severa.";
		}else if(imc >= 40 && imc < 50){
			msg = "Obesidade mórbida.";
		}else{
			msg = "Super-Obesidade.";
		}
		
		//exibindo resultado
		System.out.println("\nSeu IMC: " + imc);
		System.out.println("Sua condição: " + msg);


	}

}
