package estruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String valor = "";

		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("Voc� s� ir� sair da repeti��o quando dizer 'sair': ");
			valor = entrada.nextLine();
		}
		
		System.out.println("Voc� saiu");

		entrada.close();

	}

}
