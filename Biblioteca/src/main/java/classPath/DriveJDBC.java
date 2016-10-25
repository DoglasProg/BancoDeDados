package classPath;
import java.sql.SQLException;

import controler.GerenteBiblioteca;
import model.Livro;

public class DriveJDBC {

	public static void main(String[] args) {
		
		try{
			System.out.println("Conectando drive");
			Class.forName("org.postgresql.Driver");
	   }

	   catch(ClassNotFoundException e)
	   {
		   System.out.println("error class not found exception");
	      e.printStackTrace();

	   }
		
		
		Livro livro = new Livro("1", "Adriano", "casaquistao", "nona");
		Livro livro2 = new Livro("2", "taner", "redes", "quinta");
		Livro livro3 = new Livro("3", "narnian", "narn", "terceira");
		GerenteBiblioteca gere = new GerenteBiblioteca();
		try {
			gere.salvar(livro);
			gere.salvar(livro2);
			gere.salvar(livro3);
			livro.setAutor("Token");
			livro.setTitulo("O senhor dos aneis");
			livro.setEdicao("terceira");
			
			gere.excluir(livro2);
			gere.atualizar(livro);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
