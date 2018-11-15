package Entities;

public class Produtos {
	private String nome;
	private double preco;
	
	public Produtos( ) {
		
	}

	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String etiquetaProduto () {
		return nome
				    + " $ " 
				    + String.format("%.2f", preco);
	}
}
