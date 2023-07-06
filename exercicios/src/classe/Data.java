package classe;

public class Data {

	int dia = 1;
	String diaSemana = "Quinta";
	String mes = "Janeiro";
	int ano = 1970;
	
	
	Data(){
		
	}
	Data(int diaRecebido, String diaSemanaRecebido, String mesRecebido, int anoRecebido){
		dia = diaRecebido;
		diaSemana = diaSemanaRecebido;
		mes = mesRecebido;
		ano = anoRecebido;
	}
	
	
	
	String dataFormatada() {
		String data = dia + "/" +  mes + "/" + ano + "(" + diaSemana + ")";
		return data;
	}
}
