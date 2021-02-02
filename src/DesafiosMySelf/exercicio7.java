package DesafiosMySelf;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double numero = 0;
		int somaNum = 0;
		
		while(numero >= 0) {
			System.out.println("Digite um numero ");
			numero = entrada.nextDouble();
			
			if (numero >= 0) {
				somaNum += numero;
				System.out.println("Soma = " + somaNum);
			}
		}
		
		
	}
}