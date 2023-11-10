package lambda;

public class Test {
	public static void main(String[] args) {
		
		Calc calc = (x, y) -> {return x+y;};
		System.out.println(calc.exec(3, 7));
		
		calc = (x, y) -> x*y;
		
		System.out.println(calc.exec(3, 7));
	}
}
