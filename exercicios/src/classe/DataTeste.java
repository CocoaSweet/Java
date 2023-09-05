package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data quando = new Data(7, "Sábado", "Agosto", 2004);
		
		Data quandoDele = new Data();
		
		quandoDele.dia = 15;
		quandoDele.diaSemana = "Quinta";
		quandoDele.mes = "Junho";
		quandoDele.ano = 2000;
		
		Data quandoExtra = new Data();
		
		
		System.out.println(quando.dataFormatada());
		System.out.println(quandoDele.dataFormatada());
		System.out.println(quandoExtra.dataFormatada());
	}
}
