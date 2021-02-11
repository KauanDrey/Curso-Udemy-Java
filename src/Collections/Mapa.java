package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Kauan");
		usuarios.put(2, "Bidu");
		usuarios.put(3, "Bethovenn");
		System.out.println(usuarios.size()); // mostra quantos elementos possui na fila, pilha, map ...
		System.out.println(usuarios.isEmpty()); // informa se a lista está vazia
		System.out.println(usuarios.keySet()); // mostra apenas os numeros
		System.out.println(usuarios.values()); // mostra apenas os nomes
		System.out.println(usuarios.entrySet()); // mostra numero e o nome
		System.out.println(usuarios.containsKey(20)); // mostra se o numero existe
		System.out.println(usuarios.containsValue("Bidu")); // mostra se o nome existe
		System.out.println(usuarios.get(3)); // mostra o nome do número escolhido
		System.out.println(usuarios.remove(1)); // remove do mapa
		System.out.println(usuarios.remove(1, "Bethovenn")); // remove passando numero e nome
		
		for(int chaves : usuarios.keySet()) { // .keySet percorrendo os números
			System.out.println(chaves);
		}
	
		for (String valores : usuarios.values()) { // .values percorrendo os nomes
			System.out.println(valores);
		}
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) { // Entry percorre numero e nome
			System.out.print(registro.getKey() + " ");
			System.out.print(registro.getValue() + " ");
		}
		
	}

}
