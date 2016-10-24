package UnitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Aluno;
import Model.Professor;
import Model.Projeto;

public class ProjetoTest {
	
	 private Aluno aluno;
	 private Professor prof;
	 private Projeto proj;

	@Before
	public void instanciandoProjeto(){
		this.aluno = new Aluno("Doglas", 5, "1423080001");
		this.prof = new Professor("Adriano","1234567");
		this.proj = new Projeto.ProjetoBuilder(prof).builder();
	}
	
	@Test
	public void isProjetoNull(){
		assertNotNull(proj);
	}

}
