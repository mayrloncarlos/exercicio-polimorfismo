package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produtos {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dataFabricacao;

	public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiquetaProduto () {
		return getNome()
				         + " (Usado) $ " 
				         + String.format("%.2f", getPreco())
				         + " (Data de Fabricação: "
				         + sdf.format(dataFabricacao)
				         + ")";
	}
}
