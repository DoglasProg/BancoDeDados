package Principal;

import java.sql.SQLException;

import Controler.AlunoConroller;
import Model.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("doglas", 4, "123");
		
		AlunoConroller alunoCont = new AlunoConroller();
		
		try {
			//alunoCont.salvar(aluno);
			//alunoCont.excluir(aluno);
			aluno.setNome("Rau");
			alunoCont.atualizar(aluno);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
