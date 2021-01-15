package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("bom");
		System.out.print(" dia!\n\n");

		System.out.println("Boa");
		System.out.println("tarde!!");

		System.out.printf("Loteria: %d %d %d %d %d %d%n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário : %.1f%n ", 1600.78);

		System.out.printf("Nome: %s%n", "Kauan");

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");

		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome: ");

		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("%s %s possui %d anos", nome, sobrenome, idade);
		entrada.close();

	}

}







