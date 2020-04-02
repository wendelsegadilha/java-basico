package br.com.wendelsegadilha.aula13.exercicios;

import java.util.Scanner;

public class CalculaTempoDownload {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe  tamanho do arquivo: (MB): ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe  a velocidade da sua Internet: (Mbps): ");
		double velocidadeNet = scan.nextDouble();
		
		//Calculando taxa de transferência
		/*
		Se sua conexão de internet contratada for 1MB então sabemos que sua taxa é 128KBps.
		1MB = 1024 bytes
		1024 / 8 = 128KBps
		*/
		double taxaTrasnferencia = ((velocidadeNet * 1024) / 8.0);
		
		//Calculando tempo de download
		/*
		Agora vamos definir o tempo de Download, para isso devemos saber a taxa de transferência, neste caso temos uma taxa de 128KBps.
		Temos um arquivo de 80MB.
		80 * 1024 = 81920
		81920 / 128Kps (nossa taxa de transferência) = 640 Segundos
		640 / 60 = 10, 60 Segundos.
		*/
		double tempoDownload = (((tamanhoArquivo * 1024) / taxaTrasnferencia) / 60.0);
		System.out.println("Tempo aproximado para o fim do download: " + tempoDownload + " minutos.");
		

	}

}
