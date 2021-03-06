package DaoHibernate;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import Model.Aluno;

public class AlunoDaoHibernate {
	
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
	
	@SuppressWarnings("unchecked")
	public List<Aluno> listar() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria consulta = session.createCriteria(Aluno.class);
			List<Aluno> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

	public Aluno buscar(String termoBusca) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria crit = session.createCriteria(Aluno.class);
			  crit.add(Restrictions.eq("matricula",termoBusca));
			  crit.setMaxResults(1);
			  Aluno aluno = (Aluno) crit.uniqueResult();
			return (Aluno) aluno;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}
	
}
