package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add("Fulano");
		conjunto.add(4);
		conjunto.add(true);
		conjunto.add("e");
		
		System.out.println(conjunto.size());
		
		conjunto.add("Fulano");
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove(1.2));
		System.out.println(conjunto.size());
	
		System.out.println(conjunto.contains("Fulano"));
		System.out.println(conjunto.contains(1.3));
		
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//conjunto.retainAll(nums); União dos fatores comuns
		//conjunto.clear(); limpa o conjunto
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
				
	}
}
