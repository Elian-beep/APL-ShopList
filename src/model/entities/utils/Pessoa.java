package model.entities.utils;

public class Pessoa {
//	ATRIBUTOS
	protected Integer id;
	protected String nome;
	protected Integer telefone;
	protected String email;
	
	public Pessoa() {}

	public Pessoa(Integer id, String nome, Integer telefone, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
}
