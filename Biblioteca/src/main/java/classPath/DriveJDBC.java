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
		Livro livro2 = new Livro("1", "taner", "redes", "quinta");
		GerenteBiblioteca gere = new GerenteBiblioteca();
		try {
			gere.salvar(livro);
			gere.salvar(livro2);
			gere.excluir(livro2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
