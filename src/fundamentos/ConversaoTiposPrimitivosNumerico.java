package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

	public static void main(String[] args) {

		double a = 1; // impl�cita
		System.out.println(a);

		float b = (float) 1.12345678910; // expl�cita (CAST)
		System.out.println(b);

		int c = 4; // impl�cita
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);

		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
	}

}
