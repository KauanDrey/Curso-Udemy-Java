package desafiosModulo2;

import java.util.Scanner;

public class DesafioDiaSemana {

	// dom -1 | seg -2 | ter - 3 | qua -4 | qui -5 | sex -6 | sab -7

	public static void main(String[] args) {
//
//		int diasDaSemana;
//
//		Scanner entrada = new Scanner(System.in);
//
//		System.out.println("Digite o número da semana: ");
//		diasDaSemana = entrada.nextInt();
//		if (diasDaSemana <= 0 || diasDaSemana > 7) {
//			System.out.println("Número da semana inválido");
//		} else if (diasDaSemana == 2) {
//			System.out.println("Segunda feira");
//		} else if (diasDaSemana == 3) {
//			System.out.println("Terça feira");
//		} else if (diasDaSemana == 4) {
//			System.out.println("Quarta feira");
//		} else if (diasDaSemana == 5) {
//			System.out.println("Quinta feira");
//		} else if (diasDaSemana == 6) {
//			System.out.println("Sexta feira");
//		} else if (diasDaSemana == 7) {
//			System.out.println("Sábado");
//		} else if (diasDaSemana == 1) {
//			System.out.println("Domingo");
//		}
//
//		System.out.println("Fim!!!");
//		entrada.close();

		Scanner open = new Scanner(System.in);

		System.out.println("Digite o nome da semana: ");
		String dia = open.nextLine();
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
			System.out.println(3);
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if (dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia da semana inválido");
		}

		System.out.println("\nFim!!!");
		open.close();

	}

}
