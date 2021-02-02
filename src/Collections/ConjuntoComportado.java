package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>(); // garante a ordem de inserção
		listaAprovados.add("Kauan");
		listaAprovados.add("Ana");
		listaAprovados.add("Pedro");
		listaAprovados.add("Mickey");

		for (String candidatos : listaAprovados) {
			System.out.println(candidatos);

		}

		System.out.println("________________");

		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		for (int n : nums) {
			System.out.println(n);

			// nums.get(1); não é possível acessar pela index
		}
	}

}
