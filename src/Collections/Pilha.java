package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		livros.add("O pequeno príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String OsLivros : livros) {
			System.out.println(OsLivros);
		}
		
		System.out.println("________________________\n");
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		/*
		 * livros.size(); livros.clear(); livros.contains("Don Quixote");
		 * livros.isEmpty();
		 */
	
		
		
		
		
		
		
	}
	
}
