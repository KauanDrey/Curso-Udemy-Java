package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {

		String s = new String("Texto");
		s = s.toUpperCase();
		System.out.println(s);

		// Wrappers s�o a vers�o objetos dos tipos primitivos
		// Tudo em Java s�o objetos menos os 8 tipos primitivos
		int a = 123;
		System.out.println(a);

	}

}
