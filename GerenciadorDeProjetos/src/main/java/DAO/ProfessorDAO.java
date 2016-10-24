package DAO;

import java.util.ArrayList;

import Model.Professor;

public class ProfessorDAO {
	
	private ArrayList<Professor> alunos = new ArrayList<Professor>();

	public void salvar(Professor prof) {
		alunos.add(prof);
	}
	
	public void excluir(Professor prof) {
		alunos.remove(prof);
	}
}
