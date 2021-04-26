package livraria;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
		
		double soma = livroJava8 + livroTDD;
		*/
		
		double soma =0;
		int contador = 0;
		
		while(contador <35){
			double valorDoLivro = 59.90;
			soma = soma + valorDoLivro;
			contador += 1; // ou tbm pode se utilizar: contador++;
		}
		
		
		
		System.out.println("O total em estoque é: " +soma);
		
		boolean resultado = soma<150; //variavel tipo boolean que recebe true or false
		
		if(resultado){
			System.out.println("Seu estoque está muito Baixo!");
		}
		else if(soma >= 2000){
			System.out.println("Seu estoque está muito alto!");			
		}
		else{
			System.out.println("Seu estoque está bom!");
		}
		
		
		
	}

}
