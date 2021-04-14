package casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	
	
	void testeAcessos() {
		//segredo = "...";   - PRIVATE
		//facoDentroDeCasa = "..."; DEFAULT/PACOTE
		//formaDeFalar = "..."; PROTECTED
		//todosSabem = "..."; PUBLIC
		
		
//		System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}
}
