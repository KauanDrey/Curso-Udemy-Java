package poo.Desafio;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(String nome, double preco, int quantidade) {
		itens.add(new Item(new Produto(nome, preco), quantidade));
	}

	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}

}
