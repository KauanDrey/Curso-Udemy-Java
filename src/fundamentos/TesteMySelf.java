package fundamentos;

import java.util.Date;
import java.util.Scanner;

public class TesteMySelf {

	public static void main(String[] x) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite para que time vc torçe: ");
		String time = entrada.nextLine();

		System.out.println("\nDigite seu palpite abaixo para o jogo de hoje.");

		System.out.println("\nDigite quantos gols seu time irá fazer: ");
		int palpiteTime = entrada.nextInt();

		System.out.println("Digite quantos gols o time adversário irá fazer: ");
		int palpiteAdversario = entrada.nextInt();

		System.out.printf(
				"Seu time do coração é %s e o seu palpite para o jogo de hoje é: Seu time: %s x %s adversário ", time,
				palpiteTime, palpiteAdversario);
		System.out.println("");

		System.out.print("\nSeu palpite foi efetuado às: ");

		Date dataHorarioPalpite = new Date();
		System.out.print(dataHorarioPalpite);

		entrada.close();

	}

}
