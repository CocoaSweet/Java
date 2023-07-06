package classe;

public class Data {

	int dia;
	String diaSemana;
	String mes;
	int ano;
	
	String dataFormatada() {
		String data = dia + "/" +  mes + "/" + ano + "(" + diaSemana + ")";
		return data;
	}
}
