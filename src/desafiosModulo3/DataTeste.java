package desafiosModulo3;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		d1.dia = 01;
		d1.mes = 12;
		d1.ano = 1999;

		var d2 = new Data();
		d2.dia = 01;
		d2.mes = 01;
		d2.ano = 2021;

		String dataFormatada = d1.obterDataFormatada();
		System.out.println(dataFormatada);

		System.out.println();

		d2.imprimirDataFormatada();

	}

}
