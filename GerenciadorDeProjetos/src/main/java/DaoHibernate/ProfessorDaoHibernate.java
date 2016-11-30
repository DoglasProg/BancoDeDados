package DaoHibernate;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import Model.Aluno;
import Model.Professor;
import Model.Projeto;

public class ProfessorDaoHibernate {

	private List<Professor> professores;

	public void salvar(Professor prof) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(prof);
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

	public void excluir(Professor prof) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.delete(prof);
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

	public void atualizar(Professor prof) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.update(prof);
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
	public List<Professor> listar() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria consulta = session.createCriteria(Professor.class);
			List<Professor> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

	public Professor buscar(String codigo) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria crit = session.createCriteria(Professor.class);
			crit.add(Restrictions.eq("codigo", codigo));
			crit.setMaxResults(1);
			Professor prof = (Professor) crit.uniqueResult();
			return (Professor) prof;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

}
