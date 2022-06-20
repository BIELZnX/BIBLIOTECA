package model;

public class Aluno extends Pessoa{
	public Aluno(String nome, String turma) {
		this.nome_ = nome;
		this.turma_ = turma;
	}

	private String turma_;

	public String getTurma(){
		return this.turma_;
	}
}