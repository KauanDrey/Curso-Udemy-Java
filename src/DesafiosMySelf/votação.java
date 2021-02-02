package DesafiosMySelf;

import java.util.Scanner;

public class votação {

	public static void main(String[] args) {

		String nome;
		int voto = 0;
		int qntdVoto = 0;
		int sair = 0;
		int qntd1 = 0;
		int qntd2 = 0;

		Scanner entrada = new Scanner(System.in);

		while (qntdVoto < 4 ^ sair == -1) {
			qntdVoto++;

			System.out.print("Digite aqui seu nome: ");
			nome = entrada.next();

			System.out.print("Digite aqui seu voto: 1- sim | 2- não: ");
			voto = entrada.nextInt();

			while (voto < 1 || voto > 2) {
				System.out.println("Voto incorreto, digite novamente: ");
				voto = entrada.nextInt();

			}

			if (voto == 1) {
				qntd1++;
				System.out.println("Nome = " + nome + " Voto = Sim");
			} else if (voto == 2) {
				qntd2++;
				System.out.println("Nome = " + nome + " Voto = Não");
			}

			System.out.printf("Deseja sair? digite -1 ou 0 para continuar ");
			sair = entrada.nextInt();

		}

		if (qntd1 > qntd2) {
			System.out.println("O Voto 'SIM' é o vencedor");
		} else if (qntd2 > qntd1)
			System.out.println("O Voto 'NÃO' é o vencedor");
		else if (qntd1 == qntd2) {
			System.out.println("Empate");
		}

		entrada.close();
	}

}
