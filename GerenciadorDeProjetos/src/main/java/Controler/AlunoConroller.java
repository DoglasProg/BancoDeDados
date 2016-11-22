package Controler;

import DaoHibernate.AlunoDaoHibernate;
import Model.Aluno;

public class AlunoConroller {

	private AlunoDaoHibernate alunoDao;

	public AlunoConroller() {
		alunoDao = new AlunoDaoHibernate();
	}

	public void salvar(Aluno aluno) throws Exception {
		alunoDao.salvar(aluno);

	}

	public void excluir(Aluno aluno) throws Exception {
		alunoDao.excluir(aluno);
	}

	public void atualizar(Aluno aluno) throws Exception {
		alunoDao.atualizar(aluno);
	}
	
	public Aluno buscar(Aluno aluno) throws Exception {
		return alunoDao.buscar(aluno);
	}

}
