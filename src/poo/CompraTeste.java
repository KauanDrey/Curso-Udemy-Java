package poo;

public class CompraTeste {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.cliente = "Kauan Drey";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 12, 3.89);
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		//Apenas para mostrar a rela��o bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("Total dos produtos R$" + total);
	}

}
