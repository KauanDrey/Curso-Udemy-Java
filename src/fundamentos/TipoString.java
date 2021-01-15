package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Mundo".charAt(0));

		String s = "Boa tarde".toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!!!!!!");
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		String nome = "Kauan";
		String sobrenome = "Drey";
		int idade = 21;
		long salario = 1600;

		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: R$ "
				+ salario + "\n\n";
		System.out.println(maisUmaFrase);

		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: R$ "
				+ salario + "\n\n");

		System.out.printf(
				"O jovem %s %s tem %d anos de idade, atualmente é estagiário na empresa GFT e recebe o salário do valor de R$ %d",
				nome, sobrenome, idade, salario);
		// %d valor inteiro e %f valor quebrado. Para decidir quantas casa possui depois
		// da vírgula "%2.f"

		String frase = String.format(
				"\n\nO jovem %s %s tem %d anos de idade, atualmente é estagiário na empresa GFT e recebe o salário do valor de R$ %d",
				nome, sobrenome, idade, salario);
		System.out.println(frase);

	}

}

