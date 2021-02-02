package DesafiosMySelf;

import java.util.Scanner;

public class DesafioRapahel {

	public static void main(String[] args) {

		String nome;
		double nota = 0;
		int quantidadeNotas = 0;
		int sair = 0;

		Scanner open = new Scanner(System.in);

		while (quantidadeNotas < 3 ^ sair == -1) {
			quantidadeNotas++;

			System.out.print("Informe seu nome: ");
			nome = open.next();

			System.out.print("Informe a nota : ");
			nota = open.nextDouble();

			while (nota > 10 || nota < 0) {
				System.out.println("Nota inválida. Digite novamente: ");
				nota = open.nextDouble();
			}

			System.out.println("Deseja sair? digite -1 | Deseja continuar? digite -0 ");
			sair = open.nextInt();

		}
		
		
		open.close();
	}

}
