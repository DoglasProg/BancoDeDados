package Controler;

import java.util.List;

import DaoHibernate.ProfessorDaoHibernate;
import Model.Professor;
import Model.Projeto;

public class ProfessorController {

	private ProfessorDaoHibernate professorDao;

	public ProfessorController() {
		professorDao = new ProfessorDaoHibernate();
	}

	public void salvar(Professor professor) throws Exception{
		professorDao.salvar(professor);

	}

	public void excluir(Professor professor) throws Exception{
		professorDao.excluir(professor);
	}

	public void atualizar(Professor professor) throws Exception {
		professorDao.atualizar(professor);
	}

	public List<Professor> listar() {
		return professorDao.listar();
	}

	public Professor buscar(String codigo) {
		return professorDao.buscar(codigo);
	}
	
}
