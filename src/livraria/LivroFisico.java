package livraria;

public class LivroFisico extends Livro{
	public LivroFisico(Autor autor){
		super (autor);
	}
	
	public double getTaxaImpress�o(){
		return this.getValor() * 0.5;
	}
	
	public boolean aplicaDescontoDe(double porcentagem){
		if(porcentagem > 0.3){
			//System.out.println("Desconto n�o pode ser maior que 30%");
			return false;
		}else{
			double desconto = getValor() *porcentagem;
			setValor(getValor() - desconto);
			System.out.println("aplicando desconto no LivroFisoco");
			return true;
		}
		
		
	}

}
