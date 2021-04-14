package poo.heranca;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else
			velocidadeAtual += getDelta();

	}

	public boolean frear() {
		if (velocidadeAtual > 0) {
			velocidadeAtual -= 5;
			return true;
		} else {
			System.out.println("Carro já está parado");
			return false;
		}

	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

}
