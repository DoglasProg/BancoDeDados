package UNitTestHibernate;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Controler.TecnologiasController;
import DaoHibernate.TecnologiasDaoHibernate;
import Model.Tecnologia;

public class TecnologiaTesteHibernate {
	
	Tecnologia tec;
	TecnologiasDaoHibernate tecDao;
	TecnologiasController cont;
	List<Tecnologia> tecnologias;
	
	@Before
	public void instanciandoAluno(){
		tec = new Tecnologia();
		tecDao = new TecnologiasDaoHibernate();
		cont = new TecnologiasController();
		tecnologias = new ArrayList<Tecnologia>();
	}
	
	@Test
	public void salvarEBuscarPotTitulo(){
		try {
			Tecnologia tecn = new Tecnologia();
			tecn.setDescricao("teste");
			tecn.setLinkComponente("www.www");
			tecn.setNome("Hibernate");
			tecn.setTipo("Framework");
			tecn.setTitulo("titulo");
			tecnologias.add(tecn);
			
			cont.salvar(tecn);
			Tecnologia Buscar = cont.buscarTitulo(tecn.getTitulo());
			if(tecn.getTitulo().equals(Buscar.getTitulo())){
				assertTrue("Resultado certo",true);
			}else{
				fail("Resultado errado");
			}
		} catch (Exception e) {
			fail("Resultado errado");
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void buscarPorDescricao(){
		try {
			for (Tecnologia tecnologia : tecnologias) {
				Tecnologia Buscar = cont.buscarDescricao(tecnologia.getDescricao());
				if(tecnologia.getDescricao().equals(Buscar.getDescricao())){
					assertTrue("Resultado certo",true);
				}else{
					fail("Resultado errado");
				}
			}
			
		} catch (Exception e) {
			fail("Resultado errado");
			e.printStackTrace();
		}
		
	}

}
