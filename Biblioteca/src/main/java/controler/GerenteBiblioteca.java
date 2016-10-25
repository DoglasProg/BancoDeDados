package controler;

import java.sql.SQLException;

import dao.LivroDoa;
import model.Livro;

public class GerenteBiblioteca {
	
	private LivroDoa livroDoa;
	
	public GerenteBiblioteca (){
		livroDoa = new LivroDoa();
	}
	
	public void salvar(Livro livro) throws SQLException{
		livroDoa.salvar(livro);
	}
	
	public void excluir(Livro livro) throws SQLException{
		livroDoa.excluir(livro);
	}
	
	public void atualizar(Livro livro) throws SQLException{
		livroDoa.atualizar(livro);
	}

}
