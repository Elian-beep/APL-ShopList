package model.entities;

import java.util.List;

import model.entities.utils.Pessoa;

public class Cliente extends Pessoa{
		
	private ListaCompra listaCompra;
	
	public Cliente() {}

	public Cliente(Integer id, String nome, Integer telefone, String email, ListaCompra listaCompra) {
		super(id, nome, telefone, email);
		this.listaCompra = listaCompra;
	}
	
}
