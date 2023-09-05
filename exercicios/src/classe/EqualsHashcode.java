package classe;

public class EqualsHashcode {
	
	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Fulano Sousa", "fulano.sousa@email.com");
		Usuario user2 = new Usuario("Fulano Sousa", "fulano.sousa@email.com");
		
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
		System.out.println(user2.equals(user1));
	}
}
