package model;

public class Livro {
	public Livro(String nome, String autor) {
		this.nome_ = nome;
		this.autor_ = autor;
	}

	private String nome_;
	private String autor_;

	public String getNome(){
		return this.nome_;
	}
	public String getAutor(){
		return this.autor_;
	}
}