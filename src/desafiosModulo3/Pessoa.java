package desafiosModulo3;

public class Pessoa {

	String nome;
	double peso;

	public Pessoa() {

	}

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public void comer(Comida comida) {
		System.out.printf("Nome: %s , Voc� comeu: %s , Seu peso � : %.2f e e engordou para: %.2f\n", nome, comida.nome, peso,
				peso += comida.peso);
	}

}
