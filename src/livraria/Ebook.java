package livraria;

public class Ebook extends Livro {
	
	
	private String waterMark;
	
	public Ebook(Autor autor){ // construtor da Classe Ebook
		super (autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem){
		if(porcentagem > 0.15){
			System.out.println("O desconto não pode ser maior que 15%");
			return false;
		} else{
			double desconto = this.getValor() * porcentagem;
			this.setValor(this.getValor() - desconto);
			return true;
		}
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	
	

}
