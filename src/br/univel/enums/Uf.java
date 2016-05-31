package br.univel.enums;

public enum Uf {
	
	PR(4, "Paraná"),
	SC(5, "Santa Catarina"),
	RS(6, "Rio Grande do Sul");
	
	private int id;
	private String nome;

	private Uf(int id, String nome){
		this.id = id;
		this.nome = nome;
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
