package model.entities.utils;

public class ProdutoLista {
	private Integer id;
	private String nomeSupermercado;
	private String nomeProduto;
	private Double valor;
	private Integer quantidade;
	private Integer supermercadoId;
	
	public ProdutoLista() {}

	public ProdutoLista(Integer id, String nomeSupermercado, String nomeProduto, Double valor, Integer quantidade,
			Integer supermercadoId) {
		this.id = id;
		this.nomeSupermercado = nomeSupermercado;
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.quantidade = quantidade;
		this.supermercadoId = supermercadoId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeSupermercado() {
		return nomeSupermercado;
	}

	public void setNomeSupermercado(String nomeSupermercado) {
		this.nomeSupermercado = nomeSupermercado;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getSupermercadoId() {
		return supermercadoId;
	}

	public void setSupermercadoId(Integer supermercadoId) {
		this.supermercadoId = supermercadoId;
	}
	
	
}
