package fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		
		double parte1 = Math.pow(6 * (3+2), 2) / (3*2);
		double parte2 = Math.pow(((1-5) * (2-7))/2, 2);
		int resultado = (int) ((int) Math.pow(parte1 - parte2, 3) / Math.pow(10, 3));
		
		System.out.println(resultado);
	}

}
