package UnitTest;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Professor;

public class ProfessorTest {

	private Professor prof;

	@Before
	public void instanciandoProfessor(){
		this.prof = new Professor("Adriano","1234567");
	}
	
	@Test
	public void isProfessorNull(){
		assertNotNull(prof);
	}
}
