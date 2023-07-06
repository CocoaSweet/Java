package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data quando = new Data();
		
		quando.dia = 7;
		quando.diaSemana = "Sábado";
		quando.mes = "Agosto";
		quando.ano = 2004;
		
		Data quandoDele = new Data();
		
		quandoDele.dia = 15;
		quandoDele.diaSemana = "Quinta";
		quandoDele.mes = "Junho";
		quandoDele.ano = 2000;
		
		
		System.out.printf(quando.dataFormatada());
		System.out.printf("\n" + quandoDele.dataFormatada());
	}
}
