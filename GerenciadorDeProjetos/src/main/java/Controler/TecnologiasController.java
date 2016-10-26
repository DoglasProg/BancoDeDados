package Controler;

import DAO.TecnologiasDAO;
import Model.Projeto;
import Model.Tecnologias;

public class TecnologiasController {
	
	private TecnologiasDAO tecnologiasoDao;

	public TecnologiasController() {
		tecnologiasoDao = new TecnologiasDAO();
	}

	public void salvar(Tecnologias tecnologia){
		tecnologiasoDao.salvar(tecnologia);
	}

	public void excluir(Tecnologias tecnologia){
		tecnologiasoDao.excluir(tecnologia);
	}

	public void atualizar(Tecnologias tecnologia){
		tecnologiasoDao.atualizar(tecnologia);
	}


}
