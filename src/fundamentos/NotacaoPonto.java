package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Good morning S";
		s = s.replace("S", "Ms");
		s = s.toUpperCase();
		s = s.concat("!!!!");
		System.out.println(s);

		System.out.println("Kauan".toUpperCase());
		
		String y = "Good morning S".replace("S", "Kauan");
		System.out.println(y);
	}

	//Tipos primitivos não tem o operador "."
}