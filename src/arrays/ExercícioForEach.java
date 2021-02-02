package arrays;

public class ExercícioForEach {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		double totalA = 0;

		for (double nota : notasAlunoA) {
			totalA += nota;
		}
		System.out.println("Sua média é = " + totalA / notasAlunoA.length);

	}

}
