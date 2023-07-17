package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Maria"); // se não houver mais espaço na fila pode retornar exceção
		fila.offer("João"); // retorna false ou true se for possível oiu não adicionar mais elementos na fila
		fila.add("Pedro");
		fila.offer("Isa");
		fila.add("Gui");
		fila.offer("Cacau");
		fila.add("Ronaldo");
		
		System.out.println(fila);
		
		//obter próximo elemento da fila sem remover
		fila.peek(); // retorna null se não houver mais elementos na fila
		fila.element(); // retorna exceção se não houver mais elementos na fila 
		
		System.out.println(fila.size());
		//fila.clear();
		System.out.println(fila.isEmpty());
		
		//obter próximo elemento da fila e remover
		System.out.println(fila.poll()); //retorna false se não houver elementos
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); //retorna exceção se não houver elementos
		
		System.out.println(fila.contains("Gui"));

	}
}
