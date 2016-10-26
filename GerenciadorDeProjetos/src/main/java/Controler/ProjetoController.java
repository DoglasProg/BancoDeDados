package Controler;

import DAO.ProjetoDAO;
import Model.Projeto;

public class ProjetoController {
	
	private ProjetoDAO projetoDao;

	public ProjetoController() {
		projetoDao = new ProjetoDAO();
	}

	public void salvar(Projeto projeto){
		projetoDao.salvar(projeto);
	}

	public void excluir(Projeto projeto){
		projetoDao.excluir(projeto);
	}

	public void atualizar(Projeto projeto){
		projetoDao.atualizar(projeto);
	}


}
