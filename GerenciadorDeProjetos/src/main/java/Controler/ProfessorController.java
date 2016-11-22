package Controler;

import Dao.ProfessorDAO;
import Model.Professor;

public class ProfessorController {

	private ProfessorDAO professorDao;

	public ProfessorController() {
		professorDao = new ProfessorDAO();
	}

	public void salvar(Professor professor){
		professorDao.salvar(professor);

	}

	public void excluir(Professor professor){
		professorDao.excluir(professor);
	}

	public void atualizar(Professor professor) {
		professorDao.atualizar(professor);
	}
	
}
