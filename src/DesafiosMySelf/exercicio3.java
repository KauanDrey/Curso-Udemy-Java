package DesafiosMySelf;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		double nota1 = 0;
		double nota2 = 0;
		int quantidadeNotas = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();

		while (nota1 < 0 || nota1 > 10) {
			System.out.println("Nota inv�lida: ");
			nota1 = entrada.nextDouble();
		}

		System.out.println("Digite a segunda nota:");
		nota2 = entrada.nextDouble();

		while (nota2 < 0 || nota2 > 10) {
			System.out.println("Nota inv�lida: ");
			nota2 = entrada.nextDouble();
		}

		double media = (nota1 + nota2) / 2;

		System.out.printf("Sua m�dia �: %f\n", media);

		if (media >= 7.0) {
			System.out.println("Voc� est� aprovado");
		} else if (media >= 4) {
			System.out.println("Voc� est� de recupera��o");
		} else
			System.out.println("Voc� est� reprovado");

		entrada.close();
	}

}
