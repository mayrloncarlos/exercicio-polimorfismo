package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ProdutoImportado;
import Entities.ProdutoUsado;
import Entities.Produtos;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produtos> list = new ArrayList<>();

		System.out.print("Informe o número de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Produto #" + i + ":");
			System.out.print("Comum, Usado ou Importado? (C/U/I): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			Double preco = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Taxa Alfandegária: ");
				double taxaAlf = sc.nextDouble();
				Produtos prod1 = new ProdutoImportado(nome, preco, taxaAlf);
				list.add(prod1);
			} else if (ch == 'u') {
				System.out.print("Data de Fabricação: ");
				Date dataFabricacao = sdf.parse(sc.next());
				Produtos prod2 = new ProdutoUsado(nome, preco, dataFabricacao);
				list.add(prod2);
			} else if (ch == 'c') {
				Produtos prod3 = new Produtos(nome, preco);
				list.add(prod3);
			} else {
				System.out.println("Você informou um tipo de produto inválido");
			}
		}

		System.out.println();
		System.out.println("Etiquetas de Preço");
		for (Produtos prod : list) {
			System.out.println(prod.etiquetaProduto());
		}

		sc.close();
	}

}
