package Teste;

import poo.heranca.Heroi;
import poo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		Monstro mosntro = new Monstro();

		mosntro.x = 10;
		mosntro.y = 10;

		Heroi heroi = new Heroi(10, 11);
		//heroi.x = 10;
		//heroi.y = 11;

		System.out.println("Monstro tem => " + mosntro.vida);
		System.out.println("Herói tem => " + heroi.vida);

		mosntro.atacar(heroi);
		heroi.atacar(mosntro);
		
		
		System.out.println("Monstro tem => " + mosntro.vida);
		System.out.println("Herói tem => " + heroi.vida);

	}

}
