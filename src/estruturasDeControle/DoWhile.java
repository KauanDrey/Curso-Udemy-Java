package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {

	// if ("express�o verdadeira ou falsa") senten�a; ou {}
	// while ("express�o verdadeira ou falsa") senten�a; ou {}
	// for (inicializa��o da vari�vel; express�o; incremento ou decremento;)
	// senten�a; ou {}
	// do senten�a; ou {} while (...); temrmina com ';'
	
	// do while executa pelo menos uma vez

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor";
		
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas 'por favor' para sair da estrutura de repeti��o. ");
			System.out.print("Voc� deseja sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		System.out.println("Obrigado!! Voc� saiu!");
		
		entrada.close();
		
		
	}

}
