package Controler;

import Dao.TecnologiasDAO;
import DaoHibernate.TecnologiasDaoHibernate;
import Model.Aluno;
import Model.Tecnologia;

public class TecnologiasController {
	
	private TecnologiasDaoHibernate tecnologiasoDao;

	public TecnologiasController() {
		tecnologiasoDao = new TecnologiasDaoHibernate();
	}

	public void salvar(Tecnologia tecnologia) throws Exception{
		tecnologiasoDao.salvar(tecnologia);
	}

	public void excluir(Tecnologia tecnologia) throws Exception{
		tecnologiasoDao.excluir(tecnologia);
	}

	public void atualizar(Tecnologia tecnologia) throws Exception{
		tecnologiasoDao.atualizar(tecnologia);
	}

	public Tecnologia buscarTitulo(String titulo) {
		return tecnologiasoDao.buscarTitulo(titulo);
	}

	public Tecnologia buscarDescricao(String descricao) {
		return tecnologiasoDao.buscarDescricao(descricao);
	}


}
