package desafiosModulo1;

public class DesafioLogicos {

	public static void main(String[] args) {

		// Trabalho na terça (V OU F)
		// Trabalho na quinta (V OU F)

		System.out.println("Tabela verdade");
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete; //Operador unário
		
		System.out.println("Comprou Televisão 50: " + comprouTV50);
		System.out.println("Comprou Televisão 32: " + comprouTV32);
		System.out.println("Comprou sorvete: " + comprouSorvete);
		System.out.println("Mais saudável: " + maisSaudavel);
	}

}
