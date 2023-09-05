package classe;

import java.util.Objects;

public class Usuario {

	String nome;
	String email;
	
	Usuario() {
	}

	Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public int hashCode() {
		return Objects.hash(email, nome);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}


	
}
