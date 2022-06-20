package model;

import java.util.ArrayList;

public class Livro {
	public Livro(String nome, String autor) {
		nome_ = nome;
		autor_ = autor;
		historico_ = new ArrayList<Alunos>();
	}

	private String nome_;
	private String autor_;
	private ArrayList<Alunos> historico;

	public String getNome(){
		return nome_;
	}
	public String getAutor(){
		return autor_;
	}
	public ArrayList<Alunos> getHistorico(){
		return historico_;
	}

	public int Alugar (Aluno aluno) {
		for (int i = 0; i < historico.length; i++) {
			if (historico_.get(i).getNome() = aluno.nome_) {
				return 1;
			}
		}
		historico.add(aluno);
	}

}