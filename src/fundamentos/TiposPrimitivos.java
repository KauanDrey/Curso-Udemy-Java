package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//Informa��es de um funcion�rio
		
		
		//Tipos n�mericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulado = 3134845223L;
		
		
		//Tipos n�meros reais
		float salario = 1144544F;
		double vendasAcumuladas = 2991797103.01;
		
		
		//Tipos booleano		
		boolean estaDeFerias = false; // ou true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulado / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("Est� de f�rias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}

}
