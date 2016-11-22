package UnitTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import Model.Aluno;

public class AlunoTest {
	
	private Aluno aluno;	

	@Before
	public void instanciandoAluno(){
		//this.aluno = new Aluno("Doglas", 5, "1423080001");
	}
	
	@Test
	public void isAlunoNull(){
		assertNotNull(aluno);
	}

}
