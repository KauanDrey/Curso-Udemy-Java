package desafiosModulo3;

public class Data {
	
	int dia;
	int mes;
	int ano;

	String obterDataFormatada() {
		
		return String.format("A primeira data � %d/%d/%d", dia, mes, ano);
		
	}
	
	// N�o funciona em p�gina web e aplica��o, apenas em cosole
	void imprimirDataFormatada() {
		System.out.printf("A primeira data � %d/%d/%d", dia, mes, ano);
	}
	
}
