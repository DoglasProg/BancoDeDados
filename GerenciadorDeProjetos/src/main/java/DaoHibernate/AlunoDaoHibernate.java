package DaoHibernate;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.Aluno;

public class AlunoDaoHibernate {
	
	private Class<Aluno> listaAlunos;
	
	
	public void salvar(Aluno aluno) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(aluno);
			session.beginTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				((Transaction) session).rollback();
			}
			throw e;
		} finally {
			session.close();
		}
	}

	public void excluir(Aluno aluno) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.delete(aluno);
			session.beginTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				((Transaction) session).rollback();
			}
			throw e;
		} finally {
			session.close();
		}
		

	}

	public void atualizar(Aluno aluno) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.update(aluno);
			session.beginTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				((Transaction) session).rollback();
			}
			throw e;
		} finally {
			session.close();
		}

	}
	
	public Aluno buscar(Aluno aluno) throws Exception{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try{
		Criteria criteria = session.createCriteria(aluno.getNome());
		@SuppressWarnings("unchecked")
		Aluno resultado = (Aluno) criteria.uniqueResult();
		return resultado;
		}catch(Exception e){
			throw e;
		}finally{
			session.close();
		}
	}

}
