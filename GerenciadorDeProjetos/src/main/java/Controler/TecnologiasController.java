package Controler;

import Dao.TecnologiasDAO;
import Model.Tecnologia;

public class TecnologiasController {
	
	private TecnologiasDAO tecnologiasoDao;

	public TecnologiasController() {
		tecnologiasoDao = new TecnologiasDAO();
	}

	public void salvar(Tecnologia tecnologia){
		tecnologiasoDao.salvar(tecnologia);
	}

	public void excluir(Tecnologia tecnologia){
		tecnologiasoDao.excluir(tecnologia);
	}

	public void atualizar(Tecnologia tecnologia){
		tecnologiasoDao.atualizar(tecnologia);
	}


}
