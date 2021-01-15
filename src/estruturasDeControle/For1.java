package estruturasDeControle;

public class For1 {

	public static void main(String[] args) {

		int contador = 0;

		while (contador <= 20) {
			System.out.printf("I = %d\n", contador);
			contador += 2;
		}

		System.out.println("");

		for (int y = 0; y <= 20; y += 2) {
			System.out.printf("I = %d\n", y);
		}

		System.out.println("");

		int x = 1;
		for (; x <= 10;) {
			System.out.printf("I = %d\n", x);
			x++;
		}

		// Laço infito

		/*
		 * for(;;) { System.out.println("Infinidade"); }
		 */

	}

}
