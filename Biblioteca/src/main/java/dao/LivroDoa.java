package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import model.Livro;

public class LivroDoa {
	
	
	public void salvar(Livro livro) throws SQLException{
		Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/biblioteca", "postgres", "shinigami");
		Statement stmt = conn.createStatement();
		
		String str = "'" + livro.getId() + "'" + "," + "'"+ livro.getAutor() + "'" + "," + "'" +
				livro.getTitulo()+"'" + "," + "'" + livro.getEdicao()+"'";
		
		System.out.println(str);
		stmt.executeUpdate("insert into Livros (id, autor, titulo, edicao) values ("+str+")");
		conn.close();
	}
	
	
	public void excluir(Livro livro) throws SQLException{
		Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/biblioteca", "postgres", "shinigami");
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("delete from livros where id =" + "'" + livro.getId() + "'");
		conn.close();
	}
	
	
	public void atualizar(Livro livro) throws SQLException{
		Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/biblioteca", "postgres", "shinigami");
		Statement stmt = conn.createStatement();
		
		stmt.executeUpdate("update livros set autor =" + " '" + livro.getAutor()+"' ," +
				"titulo =" + " '" + livro.getTitulo()+"' ," +
				"edicao =" + "'" + livro.getEdicao() +"' "  +
				"where id =" + " '" + livro.getId() +"'");
		
		conn.close();
	}
	

}
