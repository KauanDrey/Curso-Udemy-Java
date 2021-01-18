package estruturasDeControle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String programador = "senior";

		switch (programador.toLowerCase()) {
		case "senior":
			System.out.println(
					"Fundamentos Java, Orientação a Objeto, Programação Funcional, MySQL, MongoDB, Spring Boot, JavaFX, JPA, Hibernate e mais");
		case "pleno":
			System.out.println(
					"Fundamentos Java, Orientação a Objeto, Programação Funcional, MySQL, MongoDB, Spring Boot, JavaFX, JPA, Hibernate");
		case "junior":
			System.out.println("Fundamentos Java, Orientação a Objeto, MySQL, Spring Boot, Hibernate");
			break;
		default:
			System.out.println("Sou de outra Profissão");
		}

		System.out.println("");

		int idade = 3;

		switch (idade) {
		case 3:
			System.out.println("Sei andar");
		case 2:
			System.out.println("Sei engatinhar");
		case 1:
			System.out.println("Sei pegar as coisas");
		case 0:
			System.out.println("Sei respirar");
			break;
		default:
			System.out.println("Ainda não nasci!");
		}

	}

}
