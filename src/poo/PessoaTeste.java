package poo;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Kauan", "Drey", -21);
		p1.setIdade(121);
	

		System.out.println("Nome:" + p1.getNome() + " Idade:" + p1.getIdade());
		System.out.println(p1); // chama o método toString
		System.out.println(p1.getNomeCompleto());
		
	}

}
