package desafiosModulo3;

public class Data {

	public int dia;
	public int mes;
	public int ano;

	public Data() {
		// dia = 01;
		// mes = 01;
		// ano = 1970;
		this(01, 01, 1970);
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String obterDataFormatada() {
		final String formatado = "A primeira data é %d/%d/%d\n";
		return String.format(formatado, dia, mes, ano);

	}

	// Não funciona em página web e aplicação, apenas em cosole
	public void imprimirDataFormatada() {
		System.out.printf("A primeira data é %d/%d/%d", dia, mes, ano);
	}

}
