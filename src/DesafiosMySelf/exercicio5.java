package DesafiosMySelf;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int contadorDeDivisores = 0;

		System.out.print("Iforme o numero: ");
		numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {
		case 1:
			System.out.println("\nO numero " + numero + " é primo.");
			break;
		default:
			System.out.println("\nO numero " + numero + " não é primo.");

		}
	}

}
