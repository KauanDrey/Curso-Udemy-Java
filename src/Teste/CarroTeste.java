package Teste;

import poo.heranca.Civic;
import poo.heranca.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {

		Ferrari f1 = new Ferrari(150);
		f1.ligarAr();
		f1.acelerar();
		f1.frear();
		f1.acelerar();
		f1.frear();
		f1.acelerar();
		System.out.println(f1.velocidadeAr());


		System.out.println("Velocidade atual da Ferrari é de => " + f1.velocidadeAtual + " KM/H");
		
		
		Civic c1 = new Civic();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println("Velocidade atual do Civic é de => " + c1.velocidadeAtual + " KM/H");

	}

}
