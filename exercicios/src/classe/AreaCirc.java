package classe;

public class AreaCirc {

	double raio;
	static final double pi = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	double area() {
		return Math.pow(raio, 2) * pi; 
	}
	static double area(double raio) {
		return Math.pow(raio, 2) * pi; 
	}
}
