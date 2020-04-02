package br.com.wendelsegadilha.aula13;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int valor = 10;
		
		//POS INCREMENTO
		System.out.println(valor++);
		System.out.println(valor);
		
		//PRE INCREMENTO
		System.out.println(++valor);
		System.out.println(valor);
		
		//POS INCREMENTO
		System.out.println(valor--);
		System.out.println(valor);
				
		//PRE INCREMENTO
		System.out.println(--valor);
		System.out.println(valor);
		
		//SERVE PARA TODOS OS OPERADORES MATEMÁTICOS
		int var = 5;
		var = var + 1;
		var += 1;
		System.out.println(var);
		var -= 1;
		System.out.println(var);

	}

}
