package controle;

public class DesafioFor {
	public static void main(String[] args) {
				
		for(String i = "#"; i.intern() != "######"; i += "#") {
			System.out.println(i);
		}
	}
}
