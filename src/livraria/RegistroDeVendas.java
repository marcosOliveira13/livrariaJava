package livraria;

public class RegistroDeVendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Teste-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Teste-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("total: "+ carrinho.getTotal());

	}

}
