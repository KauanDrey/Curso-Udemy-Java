package DesafiosMySelf;

import java.util.Scanner;

public class DesafioRaphael2 {

	public static void main(String[] args) {

		int numeroInicial;
		int numeroFinal = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero inicial: ");
		numeroInicial = entrada.nextInt();
		
		while (numeroInicial < 0) {
			System.out.println("Digite novamente o n�mero inicial: ");
			numeroInicial = entrada.nextInt();			
		}

		System.out.println("Digite um numero final: ");
		numeroFinal = entrada.nextInt();
		
		while (numeroFinal <= numeroInicial) {
			System.out.println("Digite um numero maior que o inicial: ");
			numeroFinal = entrada.nextInt();
		
		}

		for (int i = numeroInicial; i < numeroFinal; i++) {

			if (i % 2 == 1) {
				System.out.println("Numeros �mpares: " + i);

			}
			entrada.close();
		}
	}
}
