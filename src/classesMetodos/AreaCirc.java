package classesMetodos;

public class AreaCirc {

	double raio = 0;
	final static double pi = 3.1415;

	public AreaCirc(double raioInicial) {
		
		raio = raioInicial;

	}

	double area() {

		return raio * raio * pi;
	}
	
	
	static double area(double raio) {
		return raio * raio * pi;
	}

}
