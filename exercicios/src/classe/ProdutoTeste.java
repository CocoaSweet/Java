package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto mercadoria = new Produto("Sapato", 70.00);
		
		Produto.desconto = 0.50;
		
		Produto mercadoria2 = new Produto();
		
		mercadoria2.nome = "Gravata";
		mercadoria2.valor = 30;
		
		System.out.println(mercadoria.nome +": R$"+ mercadoria.valorFinal());
		System.out.println(mercadoria2.nome + ": R$" + mercadoria2.valorFinal());
	}
}
