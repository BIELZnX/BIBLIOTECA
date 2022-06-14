package model;

public class Aluno {
	public Aluno(String nome, String turma) {
		this.nome_ = nome;
		this.turma_ = turma;
	}

	private String nome_;
	private String turma_;

	public String getNome(){
		return this.nome_;
	}
	public String getTurma(){
		return this.turma_;
	}
}