package desafiosModulo1;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		// + - * /
		
		
		Scanner calculadora = new Scanner (System.in);
		
		System.out.println("Digite aqui seu primeiro n�mero");
		double num1 = calculadora.nextDouble();
		
		System.out.println("Digite aqui seu segundo n�mero: ");
		double num2 = calculadora.nextDouble();
		
		System.out.println("Digite aqui qual opera��o deseja fazer: ");
		String operacao = calculadora.next();
		
		//L�gica
		double resultado = "+".equals(operacao) ? num1 + num2 : 0; 
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 :resultado;
		resultado = "%".equals(operacao) ? num1 % num2 :resultado;
		
		
		System.out.printf("A sua conta de %.2f %s %.2f � o valor = %.2f: ", num1, operacao, num2, resultado);
		
		
		calculadora.close();
	}
}
