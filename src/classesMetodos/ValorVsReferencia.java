package classesMetodos;

import desafiosModulo3.Data;

public class ValorVsReferencia {

	public static void main(String[] args) {
		double a = 2;
		double b = a; // Atribuição por valor (Primitivo)

		a++;
		b--;

		System.out.println(a + " " + b);

		Data d1 = new Data(01, 12, 1999);
		Data d2 = d1; // Atribuição por referência (Objeto)

		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2021;
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		voltarDataParaValorPadrao(d1);
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c);;
		System.out.println(c);
		
	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 01;
		d.mes = 01;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo (int c) {
		c++;
	}

}
