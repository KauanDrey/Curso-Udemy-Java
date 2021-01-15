package estruturasDeControle;

public class For2 {

	public static void main(String[] args) {

		int x = 10;
		for (; x >= 0;) {
			System.out.printf("I = %d\n", x);
			x = x - 2;
		}

		System.out.println("");
		for (int contador = 10; contador >= 0; contador -= 2) {
			System.out.printf("CONTADOR = %d\n", contador);
		}

		System.out.println("");

	}

}
