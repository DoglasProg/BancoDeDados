package Controler;

import java.sql.SQLException;

import DAO.AlunoDAO;
import Model.Aluno;

public class AlunoConroller {

	private AlunoDAO alunoDao;

	public AlunoConroller() {
		alunoDao = new AlunoDAO();
	}

	public void salvar(Aluno aluno) throws SQLException {
		alunoDao.salvar(aluno);

	}

	public void excluir(Aluno aluno) throws SQLException {
		alunoDao.excluir(aluno);
	}

	public void atualizar(Aluno aluno) throws SQLException {
		alunoDao.atualizar(aluno);
	}

}
