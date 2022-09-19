package model.entities;

import java.util.ArrayList;
import java.util.List;

import model.entities.utils.ProdutoLista;

public class ListaCompra {
	List<ProdutoLista> produtos = new ArrayList<>();
	
	public List<ProdutoLista> getProdutos() {
		return produtos;
	}

	public void inserirProduto(ProdutoLista produtoLista) {
		produtos.add(produtoLista);
	}
	
	public void removerProduto(ProdutoLista produtoLista) {
		produtos.remove(produtoLista);
	}
	
	public double somaValorProduto() {
		double somatorio = 0.0;
		for (ProdutoLista produto : produtos) {
			somatorio += produto.getQuantidade() * produto.getValor();
		}
		return somatorio;
	}
}
