package Controler;

import java.util.Date;
import java.util.List;

import DaoHibernate.ProjetosDaoHibernate;
import Model.Professor;
import Model.Projeto;

public class ProjetoController {

	private ProjetosDaoHibernate projetoDao;
	private ProfessorController profCont = new ProfessorController();
	private Projeto projeto;

	public ProjetoController() {
		projetoDao = new ProjetosDaoHibernate();
	}

	public void salvar(Projeto projeto, Professor prof) throws Exception {

		if (prof.getProjeto() != null || prof.getIdProfessor() == 0) {
			System.out.println("Professor ja possue projeto ou profesor não cadastrado, " + "operação invalida");
		} else {
			projetoDao.salvar(projeto);
			this.projeto = buscarTitulo(projeto.getTitulo());
			prof.setProjeto(this.projeto);
			profCont.atualizar(prof);

		}
	}

	public void excluir(Projeto projeto) throws Exception {
		projetoDao.excluir(projeto);
	}

	public void atualizar(Projeto projeto) throws Exception {
		projetoDao.atualizar(projeto);
	}

	public Projeto buscarTitulo(String titulo) throws Exception {
		return projetoDao.buscarTitulo(titulo);
	}

	public List<Projeto> buscarDataInicio(Date data) {
		return projetoDao.buscarDataInicio(data);
	}

	public List<Projeto> buscarDataFinal(Date dataFinal) {
		return projetoDao.buscarDataFinal(dataFinal);
	}

	public Projeto buscarResponsavel(long id) {
		return projetoDao.buscarResponsavel(id);
	}

}
