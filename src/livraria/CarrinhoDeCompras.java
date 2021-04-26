package livraria;

public class CarrinhoDeCompras {
	private double total;
	
	public void adiciona(Livro livro){
		System.out.println("adicionando: "+ livro);
		livro.aplicaDescontoDe(0.16);
		total += livro.getValor();
	}
	
	public double getTotal(){
		return total;
	}
	

}
