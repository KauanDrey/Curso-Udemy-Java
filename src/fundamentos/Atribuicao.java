package fundamentos;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /=a; // c = c / a;
		System.out.println(c);
		
		
		c++; // c = c + 1;
		c--; // c = c - 1;
		
		
		
		c %= 2; // c = c % 2; 0 ou 1 mostra se � um num par ou �mpar - 0 par / 1 �mpar
		System.out.println(c);
		
		
		
	}

}
