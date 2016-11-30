package UNitTestHibernate;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Controler.ProfessorController;
import DaoHibernate.ProfessorDaoHibernate;
import Model.Professor;

public class ProfessorTesteHibernate {
	
	Professor prof;
	ProfessorDaoHibernate profDao;
	ProfessorController cont;
	List<Professor> Professores;
	
	@Before
	public void instanciandoAluno(){
		prof = new Professor();
		profDao = new ProfessorDaoHibernate();
		cont = new ProfessorController();
	}
	
	@Test
	public void salvar(){
		try {
			Professor professor = new Professor();
			professor.setCodigo("5678");
			professor.setNome("Adriano");
			
			
			cont.salvar(professor);
			Professor Buscar = cont.buscar(professor.getCodigo());
			if(professor.getCodigo().equals(Buscar.getCodigo())){
				assertTrue("Resultado certo",true);
			}else{
				fail("Resultado errado");
			}
		} catch (Exception e) {
			fail("Resultado errado");
			e.printStackTrace();
		}
	}

}
