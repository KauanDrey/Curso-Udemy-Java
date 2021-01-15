package desafiosModulo2;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {

		double nota1;
		double nota2;
		double nota3;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua primeira nota: ");
		nota1 = entrada.nextDouble();

		System.out.println("Digite sua segunda nota: ");
		nota2 = entrada.nextDouble();

		System.out.println("Digite sua terceira nota: ");
		nota3 = entrada.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Sua média final é: " + media);

		entrada.close();

	}

}
