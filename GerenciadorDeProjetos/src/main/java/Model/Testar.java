package Model;

import Controler.ProjetoControler;

public class Testar {

	public static void main(String[] args) {
		
		Aluno a = new Aluno("jo�o",4, "1234");
		Aluno b = new Aluno("jo�oo",3, "14534");
		Professor prof = new Professor("Dani", "1234");
		ProjetoControler proj = new ProjetoControler();
		proj.adicionarAluno(a);
		proj.adicionarProfessor(prof);
	}

}
