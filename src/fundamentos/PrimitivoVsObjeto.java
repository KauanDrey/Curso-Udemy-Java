package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {

		String s = new String("Texto");
		s = s.toUpperCase();
		System.out.println(s);

		// Wrappers são a versão objetos dos tipos primitivos
		// Tudo em Java são objetos menos os 8 tipos primitivos
		int a = 123;
		System.out.println(a);

	}

}
