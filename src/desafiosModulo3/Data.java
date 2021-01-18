package desafiosModulo3;

public class Data {
	
	int dia;
	int mes;
	int ano;

	String obterDataFormatada() {
		
		return String.format("A primeira data é %d/%d/%d", dia, mes, ano);
		
	}
	
	// Não funciona em página web e aplicação, apenas em cosole
	void imprimirDataFormatada() {
		System.out.printf("A primeira data é %d/%d/%d", dia, mes, ano);
	}
	
}
