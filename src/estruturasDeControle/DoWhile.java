package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {

	// if ("expressão verdadeira ou falsa") sentença; ou {}
	// while ("expressão verdadeira ou falsa") sentença; ou {}
	// for (inicialização da variável; expressão; incremento ou decremento;)
	// sentença; ou {}
	// do sentença; ou {} while (...); temrmina com ';'
	
	// do while executa pelo menos uma vez

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas 'por favor' para sair da estrutura de repetição. ");
			System.out.print("Você deseja sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		System.out.println("Obrigado!! Você saiu!");
		
		entrada.close();
		
		
	}

}
