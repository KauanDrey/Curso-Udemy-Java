package desafiosModulo3;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Kauan", 63.5);
		Comida c1 = new Comida("Camarão", 0.50);
		
		p1.comer(c1);
		p1.comer(c1);
		System.out.println("\n");
		
		Pessoa p2 = new Pessoa("Raphael", 50);
		Comida c2 = new Comida("Strogonoff", 0.50);
		
		p2.comer(c2);
		p2.comer(c2);
		
	}
	
	
}
