package poo.polimorfismo;

public class Pessoa {

	
	private double peso;

	public Pessoa(double peso){
		setPeso(peso);
	}
	
	
	public void comer(Comida comida) {
		peso += comida.getPeso();
	}


	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
}
