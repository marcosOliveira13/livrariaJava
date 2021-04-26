package livraria;

public class testeDeConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor autor = new Autor();
		autor.nome = "Marcos";
		autor.email = "marcos@gmail.com";
		autor.cpf = "054.680.761-69";
		
		Livro livro1 = new Livro(autor);
		
		/* não funciona mais = não é estanciar o objeto livro sem 
		 * colocar como paramentro o aoutor da obra;
		 * A menos que se escreva outro constrtutor que não receba como 
		 * paramentro a autor, que seja vazio
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		*/
		//Livro livro4 = new Livro(); // teste do construtor vazio
		

	}

}
