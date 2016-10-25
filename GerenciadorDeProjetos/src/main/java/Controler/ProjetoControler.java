package Controler;

import java.sql.SQLException;

import DAO.AlunoDAO;
import DAO.ProfessorDAO;
import DAO.ProjetoDAO;
import DAO.TecnologiaDAO;
import Model.Aluno;
import Model.Professor;
import Model.Projeto;
import Model.Tecnologia;

public class ProjetoControler {
	
	private AlunoDAO alunoDao;
	private ProfessorDAO professorDAO;
	private TecnologiaDAO tecnologiaDAO;
	private ProjetoDAO ProjetoDAO;

	public ProjetoControler(){
		this.alunoDao = new AlunoDAO();
		this.professorDAO = new ProfessorDAO();
		this.tecnologiaDAO = new TecnologiaDAO();
		this.ProjetoDAO = new ProjetoDAO();
	}
	
	public void adicionarAluno(Aluno aluno) throws SQLException{
		this.alunoDao.salvar(aluno);
	}
	
	public void excluirAluno(Aluno aluno){
	}
	
	public void adicionarProfessor(Professor prof){
		this.professorDAO.salvar(prof);
	}
	
	public void excluirProfessor(Professor prof){
		this.professorDAO.excluir(prof);
	}
	
	public void adicionarTecnologia(Tecnologia tec){
		this.tecnologiaDAO.salvar(tec);
	}
	
	public void excluir(Tecnologia tec){
		this.tecnologiaDAO.excluir(tec);
	}
	
	public void adcionarProjeto(Projeto proj){
		this.ProjetoDAO.salvar(proj);
	}
	
	public void excluirProjeto(Projeto proj){
		this.ProjetoDAO.salvar(proj);
	}

}
