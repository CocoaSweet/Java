package lambda;

import java.util.function.BinaryOperator;

public class Test2 {
	public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (x, y) -> {return x+y;};
		System.out.println(calc.apply(3.0, 7.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> x*y;
		System.out.println(calc2.apply(3, 7));
	}
}
