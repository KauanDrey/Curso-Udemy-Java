package DesafiosMySelf;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu n�mero de 0 a 10: ");
		numero  = entrada.nextInt();
		
		while (numero < 0 || numero > 10) {
			System.out.println("N�mero errado, digite novamente! ");
			numero  = entrada.nextInt();
		} 
		
		if (numero % 2 == 0) {
			System.out.println("Seu n�mero � PAR e � = " + numero);
		} else 
			System.out.println("Seu n�mero � �mpar e � = " + numero);
		
		
		entrada.close();

	}

}
