package UNitTestHibernate;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Controler.ProfessorController;
import Controler.ProjetoController;
import DaoHibernate.ProjetosDaoHibernate;
import Model.Aluno;
import Model.Professor;
import Model.Projeto;

public class ProjetoTesteHibernate {

	Projeto projeto;
	ProjetosDaoHibernate ProjetoDao;
	ProjetoController cont;
	List<Projeto> projetos;
	List<Professor> professores;
	ProfessorController contProf;
	Professor professor;

	@Before
	public void instanciandoAluno() {
		projeto = new Projeto();
		ProjetoDao = new ProjetosDaoHibernate();
		cont = new ProjetoController();
		contProf = new ProfessorController();
		professor = new Professor();
	}

	@Test
	public void salvarEBuscaPorTitulo() {
		try {
			Date data = new Date("12/12/2016");
			Date data2 = new Date("11/11/2016");

			Projeto proj = new Projeto();
			proj.setAreaRelacionada("Banco de Dados");
			proj.setDataFinal(data);
			proj.setDataInicio(data2);
			proj.setDescricao("Proeto");
			proj.setTitulo("Projeto Gerenciamento de Projetos");

			Professor prof = new Professor();
			prof.setNome("Adriano");
			prof.setCodigo("007");

			contProf.salvar(prof);
			professor = contProf.buscar(prof.getCodigo());

			cont.salvar(proj, professor);
			this.projeto = cont.buscarTitulo(proj.getTitulo());
			if (proj.getTitulo().equals(this.projeto.getTitulo())) {
				assertTrue("Resultado certo", true);
			} else {
				fail("Resultado errado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void buscaPorDataInicio() {
		try {
			Date data = new Date("12/12/2016");
			Date data2 = new Date("11/11/2016");

			Projeto proj = new Projeto();
			proj.setAreaRelacionada("Banco de Dados");
			proj.setDataFinal(data);
			proj.setDataInicio(data2);
			proj.setDescricao("Proeto");
			proj.setTitulo("Projeto Gerenciamento de Projetos");

			Professor prof = new Professor();
			prof.setNome("Adriano");
			prof.setCodigo("007");

			contProf.salvar(prof);
			professor = contProf.buscar(prof.getCodigo());

			cont.salvar(proj, professor);

			this.projetos = cont.buscarDataInicio(proj.getDataInicio());
			for (Projeto projeto : projetos) {
				if (projeto.getDataInicio().equals(proj.getDataInicio())) {
					assertTrue("Resultado certo", true);
				} else {
					fail("Resultado errado");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void buscaPorDataFinal() {
		try {
			Date data = new Date("12/12/2016");
			Date data2 = new Date("11/11/2016");

			Projeto proj = new Projeto();
			proj.setAreaRelacionada("Banco de Dados");
			proj.setDataFinal(data);
			proj.setDataInicio(data2);
			proj.setDescricao("Proeto");
			proj.setTitulo("Projeto Gerenciamento de Projetos");

			Professor prof = new Professor();
			prof.setNome("Adriano");
			prof.setCodigo("007");

			contProf.salvar(prof);
			professor = contProf.buscar(prof.getCodigo());

			cont.salvar(proj, professor);

			this.projetos = cont.buscarDataFinal(proj.getDataFinal());
			for (Projeto projeto : projetos) {
				if (projeto.getDataFinal().equals(proj.getDataFinal())) {
					assertTrue("Resultado certo", true);
				} else {
					fail("Resultado errado");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void buscaPorResponsavel() {
		try {
			Date data = new Date("12/12/2016");
			Date data2 = new Date("11/11/2016");

			Projeto proj = new Projeto();
			proj.setAreaRelacionada("Banco de Dados");
			proj.setDataFinal(data);
			proj.setDataInicio(data2);
			proj.setDescricao("Proeto");
			proj.setTitulo("Projeto Gerenciamento de Projetos");

			Professor prof = new Professor();
			prof.setNome("Adriano");
			prof.setCodigo("0082");

			contProf.salvar(prof);
			professor = contProf.buscar(prof.getCodigo());

			cont.salvar(proj, professor);

			// Projeto proje = cont.buscarResponsavel(prof.getIdProfessor());
			professores = contProf.listar();
			int i = 0;
			for (Professor professor : professores) {

				if (professor.getProjeto()!= null && professor.getProjeto().getIdProjeto() == proj.getIdProjeto()) {
					i++;
					assertTrue("Resultado certo", true);
					
				} 
			}
			if(i == 0){
				fail("Resultado errado");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
