package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor autor = new Autor(); // estanciando o objeto autor
		autor.setNome("Rodrigo Turini"); // em cada Set estou atribuindo um valor.
		autor.setEmail("rodrigo.turini@gmail.com");
		autor.setCpf("123.456.789-10");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		
		livro.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Paulo Silveira");
		outroAutor.setEmail("pauloSilveira@gmail.com");
		outroAutor.setCpf("321.654.987.01");
		
		Livro outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");
		
		
		outroLivro.mostrarDetalhes();
	}
}
