package UnitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Aluno;
import Model.Tecnologia;

public class TecnologiasTest {

	private Tecnologia tecnologia;
	
	@Before
	public void instanciandoTecnologias(){
		this.tecnologia  = new Tecnologia("Node","FrameWork", "https://nodejs.org/en/", "utilisa java Script");
	}
	
	@Test
	public void isProfessorNull(){
		assertNotNull(tecnologia);
	}

}
