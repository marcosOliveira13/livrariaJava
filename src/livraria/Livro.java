package livraria;

public abstract class Livro {
	// atributos de um objeto 
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	private boolean impresso;
	
	//Metdos 
	
	public Livro(Autor autor){ // construtor da classe livro recebe como paramento autor
		this();
		this.autor = autor;
		this.impresso = true;
	//	System.out.println("novo Livro Criado com Autor");
		
	}
	
	 public Livro(){
		 this.isbn = "000-00-00000-00-0"; 
		//System.out.println("Novo livro Criado sem Autor");
	}
	
	
	
	void mostrarDetalhes (){ 

		String mensagem = "Mostrando Detalhes do livro ";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor:" + valor);
		System.out.println("ISBN: "+ isbn);
		
		if(this.temAutor()){ // recebe o retorno de temAutor() como verdade caso o atribulo autor nao for vazio 
			autor.mostrarDetalhes();	
		}else{
			System.out.println("Livro sem Autor");
		}
		
		System.out.println("---"); //para dar um espaçamento, organizar os detalhes de cada objeto
	}
	
	public boolean aplicaDescontoDe(double porcentagem){
		
		return false;
		
	}
	
	boolean temAutor(){
		
		return this.autor != null;		
	}
	
	// fim dos metodos
	
	//Gettes e setters para os atributos - get fetornar valores e setter inserem / adicionam valores as variaveis.
	
	public double getValor(){
		return valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
}

