package fundamentos;

public class Logicos {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);

		// Tabela verdade E (AND)
		System.out.println("\nTabela verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		// Tabela verdade OU || (OR)
		System.out.println("\nTabela verdade ||");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		// Tabela verdade OU exclusivo ^ (XOR)
		System.out.println("\nTabela verdade ^");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		// Tabela verdade ! ou !! (NOT) unário
		System.out.println("\nTabela verdade ! ou !!");
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!false);
		System.out.println(!!false);

	}

}
