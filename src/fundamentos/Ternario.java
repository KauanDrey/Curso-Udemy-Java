package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoRecupera��o = media >= 5.0 ? "Est� em recupera��o" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoRecupera��o; // '?' caso for verdadeiro retornar a String "Aprovado" caso for falso ':' retornar String "Reprovado" - atribui��o condicional
		System.out.println("O aluno est�: " + resultado);
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota > 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoFinal = temDesconto ? "Sim" : "N�o";
		System.out.println("Recebe desconto? " + resultadoFinal);
		
	}
	
	
}
