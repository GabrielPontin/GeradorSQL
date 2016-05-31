package br.univel;

import br.univel.anotacoes.Tabela;
import br.univel.enums.EstadoCivil;

//@Tabela = Lembra o interpretador que o nome da classe não será 'Pessoa'

@Tabela("cad_pessoa")
public class Pessoa {

	//@Tabela("oi") não pode colocar atributo pois foi utilizado AnnotationTarget no Tabela.java
	private int id;
	
	private String nome;
	
	private EstadoCivil EstadoCivil;
	
	public EstadoCivil getEstadoCivil() {
		return EstadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		EstadoCivil = estadoCivil;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
