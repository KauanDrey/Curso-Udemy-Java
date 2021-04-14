package poo.Desafio;

public class DesafioTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem("Celular", 3500, 2);
		compra1.adicionarItem("MacBook", 3500, 2);
		compra1.adicionarItem("Cropped", 120, 1);
		compra1.adicionarItem("Chinelo Adidas", 70, 1);

		Cliente cliente1 = new Cliente("Luana");
		cliente1.compras.add(compra1);

		System.out.println("Seu nome é: " + cliente1.nome + " e o valor total da sua compra foi de R$ = "
				+ cliente1.obterValorTotalDaCompra());

	}
}
