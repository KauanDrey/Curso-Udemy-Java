package poo;

public class Pessoa {

	private String nome;
	private int idade;
	private String sobrenome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Pessoa(String nome, String sobrenome, int anos) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(anos);
	}


	// lerIdade
	public int getIdade() {

		return idade;
	}

	// alterarIdade
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}

	}

	@Override
	public String toString() {
		return "Eu sou o: " + getNome() + " e tenho " + getIdade() + " anos de idade";
	}
	
	
	
	public String getNomeCompleto() {
		return getNome() + " " +	 getSobrenome();
	}

}
