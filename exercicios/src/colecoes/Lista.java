 package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario user1 = new Usuario("Guilherme");
		
		lista.add(user1);
		lista.add(new Usuario("Ligia"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Pablo"));
		lista.add(new Usuario("Alisson"));
		lista.add(new Usuario("Luna"));
		
		System.out.println(lista.get(1));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
