package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// offer e add adicionam elementos na fila

		// diferen�a ocorre � quando a fila est� cheia
		fila.add("Ana"); // retora como false
		fila.offer("Bia"); // Lan�a uma excess�o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// peek e element obter pr�ximo da fila sem remover

		// Diferen�a do comportamento ocorre quando a fila est� vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lan�a uma excess�o
		System.out.println(fila.element());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();

		// Diferen�a do comportamento ocorre quando a fila est� vazia

		// pool e remove obter pr�ximo da fila e remover
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
