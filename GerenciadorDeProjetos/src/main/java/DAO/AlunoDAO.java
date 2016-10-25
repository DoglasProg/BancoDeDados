package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Aluno;

public class AlunoDAO {
	

	public void salvar(Aluno aluno) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/gerenciadordeprojeto", "postgres", "shinigami");
		Statement stmt = conn.createStatement();
		
		String str = "'" + aluno.getMatricula() + "'" + "," + "'"+ aluno.getNome() + "'" + "," + "'" +
				aluno.getPeriodo()+"'" ;
		
		System.out.println(str);
		stmt.executeUpdate("insert into alunos (id, nome, periodo) values ("+str+")");
		conn.close();
	}
	
	public void excluir(Aluno aluno) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/gerenciadordeprojeto", "postgres", "shinigami");
		Statement stmt = conn.createStatement();
		System.out.println("delete from alunos where id =" + "'" + aluno.getMatricula() + "'");
		stmt.executeUpdate("delete from alunos where id =" + "'" + aluno.getMatricula() + "'");
		conn.close();
	}
	
	public void atualizar(Aluno aluno) throws SQLException{
		Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/gerenciadordeprojeto", "postgres", "shinigami");
		Statement stmt = conn.createStatement();
		System.out.println("update alunos set nome =" + " '" + aluno.getNome() + "' ," +
				"periodo =" + " " + aluno.getPeriodo() + " " +
				"where id =" + " '" + aluno.getMatricula() +"'");
		
		stmt.executeUpdate("update alunos set nome =" + " '" + aluno.getNome() + "' ," +
				"periodo =" + " " + aluno.getPeriodo() + " " +
				"where id =" + " '" + aluno.getMatricula() +"'");
		
		conn.close();
	}

}
