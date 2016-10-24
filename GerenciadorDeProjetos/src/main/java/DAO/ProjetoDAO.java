package DAO;

import java.util.ArrayList;

import Model.Projeto;

public class ProjetoDAO {
	
	private ArrayList<Projeto> projetos = new ArrayList<Projeto>();

	public void salvar(Projeto Projeto) {
		projetos.add(Projeto);
	}
	
	public void excluir(Projeto projeto) {
		projetos.remove(projeto);
	}

}
