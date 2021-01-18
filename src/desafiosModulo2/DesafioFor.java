package desafiosModulo2;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";
		for (char desafio = 'a'; desafio <= 'e'; desafio++) {
			System.out.println(valor);
			valor = valor + "#";

		}

		System.out.println("");
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}

	}

}
