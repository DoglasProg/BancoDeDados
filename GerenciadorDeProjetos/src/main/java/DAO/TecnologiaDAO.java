package DAO;

import java.util.ArrayList;

import Model.Tecnologia;

public class TecnologiaDAO {
	
	private ArrayList<Tecnologia> projetos = new ArrayList<Tecnologia>();

	public void salvar(Tecnologia Projeto) {
		projetos.add(Projeto);
	}
	
	public void excluir(Tecnologia projeto) {
		projetos.remove(projeto);
	}


}
