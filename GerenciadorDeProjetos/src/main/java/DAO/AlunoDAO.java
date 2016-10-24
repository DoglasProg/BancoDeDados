package DAO;

import java.util.ArrayList;

import Model.Aluno;

public class AlunoDAO {
	
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public void salvar(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void excluir(Aluno aluno) {
		alunos.remove(aluno);
	}

}
