package desafiosModulo3;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data(01, 12, 1999);
	//	d1.dia = 01;
	//	d1.mes = 12;
	//	d1.ano = 1999;
		
		var d2 = new Data();
	//	d2.ano = 2021; da para alterar valores setados percorrendo a variável

		String dataFormatada = d1.obterDataFormatada();
		System.out.println(dataFormatada);

		System.out.println();

		d2.imprimirDataFormatada();

	}

}
