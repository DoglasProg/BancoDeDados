package UNitTestHibernate;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Controler.AlunoConroller;
import DaoHibernate.AlunoDaoHibernate;
import Model.Aluno;

public class AlunoTesteHibernate {
	
	Aluno aluno;
	AlunoDaoHibernate AlunoDao;
	AlunoConroller cont;
	List<Aluno> alunos;
	
	@Before
	public void instanciandoAluno(){
		aluno = new Aluno();
		AlunoDao = new AlunoDaoHibernate();
		cont = new AlunoConroller();
	}
	
	@Test
	public void salvar(){
		try {
			Aluno al = new Aluno();
			aluno.setMatricula("12345");
			aluno.setNome("Doglas");
			aluno.setPeriodo("5");
			alunos.add(al);
			
			cont.salvar(al);
			Aluno Buscar = cont.buscar(aluno.getMatricula());
			if(aluno.getMatricula().equals(Buscar.getMatricula())){
				assertTrue("Resultado certo",true);
			}else{
				fail("Resultado errado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
