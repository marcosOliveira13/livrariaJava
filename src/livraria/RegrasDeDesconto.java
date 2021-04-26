package livraria;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turnini");
		
		//Aplica�ao de desconto em livro f�sico
		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);
		
		System.out.println("Valor atual: "+ livro.getValor());
		
		if(!livro.aplicaDescontoDe(0.3)){
			System.out.println("Desconto n�o pode ser maior que 30%");
		}else {
			System.out.println("Valor com desconto: "+ livro.getValor());
		}
		
		//Aplica��o de desconto em ebook
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if(!ebook.aplicaDescontoDe(0.3)){
			System.out.println("Desconto no ebook n�o pode ser"
					+ "maior do que 15%");
		} else{
			System.out.println("Valor do ebook com Desconto: "
					+ ebook.getValor());
		}
		
		
		

	}

}
