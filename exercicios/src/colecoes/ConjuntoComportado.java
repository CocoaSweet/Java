package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> listaEmails = new HashSet<>();
		Set<String> listaEmails = new TreeSet<>();
		listaEmails.add("fulano.silva@email.com");
		listaEmails.add("fulano.sousa@email.com");
		listaEmails.add("ciclano.silva@email.com");
		listaEmails.add("ciclano.sousa@email.com");
		listaEmails.add("beltrano.silva@email.com");
		listaEmails.add("beltrano.sousa@email.com");
		
		for(String email: listaEmails) {
			System.out.println(email);
		}
	}
}
