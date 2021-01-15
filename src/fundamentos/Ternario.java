package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoRecuperação = media >= 5.0 ? "Está em recuperação" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoRecuperação; // '?' caso for verdadeiro retornar a String "Aprovado" caso for falso ':' retornar String "Reprovado" - atribuição condicional
		System.out.println("O aluno está: " + resultado);
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota > 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoFinal = temDesconto ? "Sim" : "Não";
		System.out.println("Recebe desconto? " + resultadoFinal);
		
	}
	
	
}
