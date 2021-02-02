package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// offer e add adicionam elementos na fila

		// diferença ocorre é quando a fila está cheia
		fila.add("Ana"); // retora como false
		fila.offer("Bia"); // Lança uma excessão
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// peek e element obter próximo da fila sem remover

		// Diferença do comportamento ocorre quando a fila está vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma excessão
		System.out.println(fila.element());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();

		// Diferença do comportamento ocorre quando a fila está vazia

		// pool e remove obter próximo da fila e remover
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // retorna null;
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		System.out.println(fila.size());

	}

}
