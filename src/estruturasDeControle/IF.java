package estruturasDeControle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 6.0) {

			System.out.println("Voc� est� aprovado");
		}

		if (media >= 4.5 && media < 7) {
			System.out.println("Voc� est� de recupera��o!!");
		}

		boolean reprovado = media < 4.5 && media >= 0;
		if (reprovado) {
			System.out.println("Voc� est� reprovado!!");
		}

		entrada.close();

	}

}
