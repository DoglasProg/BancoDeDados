package Controler;

import java.util.List;

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
	
	public List<Aluno> listar() throws Exception {
		return alunoDao.listar();
	}
	
	public Aluno buscar(String termoBusca){
		return alunoDao.buscar(termoBusca);
	}

}
