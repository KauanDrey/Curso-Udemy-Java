package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println(Arrays.toString(notasAlunoA));

		double totalA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
		}
		System.out.println("Sua média é = " + totalA / notasAlunoA.length);
		System.out.println(notasAlunoA[0]);
		
		
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };

		double totalB = 0;
		for (int k = 0; k < notasAlunoB.length; k++) {
			totalB += notasAlunoB[k];
		}
		System.out.println("Sua média é = " + totalB / notasAlunoB.length);

	}

}
