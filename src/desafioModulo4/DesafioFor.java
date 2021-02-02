package desafioModulo4;

import java.util.Scanner;

public class DesafioFor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int totalNotas = 0;

		System.out.println("Digite aqui a quantidade de notas: ");
		totalNotas = entrada.nextInt();

		double[] nota = new double[totalNotas];

		for (int i = 0; i < totalNotas; i++) {
			System.out.print("Digite aqui sua nota: ");
			nota[i] = entrada.nextDouble();
		}

		double total = 0;
		for (double notas : nota) {
			total += notas;
		}

		double mediaAluno = total / totalNotas;
		System.out.println("Sua média é = " + mediaAluno);

		entrada.close();
	}

}
