package Principal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Controler.AlunoConroller;
import Model.Aluno;

public class Main {

	public static void main(String[] args) {
		
		//SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//Session session = factory.openSession();
		//session.beginTransaction();
		
		Aluno aluno = new Aluno("Doglas", "5", "123456");
		Aluno aluno2 = new Aluno("Doglas", "5", "123456");
		//aluno.setIdAluno(3);
		AlunoConroller alunocont = new AlunoConroller();
		try {
			alunocont.salvar(aluno);
			//session.save(aluno);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//session.close();
	}

}
