package classesMetodos;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Macbook Apple", 4356.89);
	//	p1.nome = "Macbook Apple";
	//	p1.preco = 4356.89;
	//	p1.desconto = 0.25;

		var p2 = new Produto("Caneta Azul", 12.56);
		
		Produto.desconto = 0.50;

		System.out.println(p1.nome + " = " + p1.precoComDesconto());
		System.out.println(p2.nome + " = " + p2.precoComDesconto());

		double precofinal1 = p1.precoComDesconto();
		double precofinal2 = p2.precoComDesconto(0.1);
		double mediaFinalCarrino = (precofinal1 + precofinal2) / 2;

		System.out.printf("Média final do carrinho = R$ %.2f  ", mediaFinalCarrino);

	}

}
