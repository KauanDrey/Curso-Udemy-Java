package estruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String valor = "";

		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você só irá sair da repetição quando dizer 'sair': ");
			valor = entrada.nextLine();
		}
		
		System.out.println("Você saiu");

		entrada.close();

	}

}
