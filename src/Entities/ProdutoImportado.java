package Entities;

public class ProdutoImportado extends Produtos {
	
	private double taxaAlf;

	public ProdutoImportado(String nome, double preco, double taxaAlf) {
		super(nome, preco);
		this.taxaAlf = taxaAlf;
	}

	public double getTaxaAlf() {
		return taxaAlf;
	}

	public void setTaxaAlf(double taxaAlf) {
		this.taxaAlf = taxaAlf;
	}
	
	public double precoTotal() {
		return getPreco() + taxaAlf;
	}
	
	@Override
	public String etiquetaProduto () {
		return getNome()
				         + " $ " 
				         + String.format("%.2f", precoTotal())
				         + " (Customs fee: $ " 
				         + String.format("%.2f", taxaAlf)
			           	 + ")";
	}
}
