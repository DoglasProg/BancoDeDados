package DaoHibernate;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import Model.Aluno;
import Model.Tecnologia;

public class TecnologiasDaoHibernate {
	
	public void salvar(Tecnologia tec) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(tec);
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

	public void excluir(Tecnologia tec) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.delete(tec);
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

	public void atualizar(Tecnologia tec) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.update(tec);
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
	public List<Tecnologia> listar() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria consulta = session.createCriteria(Tecnologia.class);
			List<Tecnologia> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

	public Tecnologia buscarTitulo(String titulo) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria crit = session.createCriteria(Tecnologia.class);
			  crit.add(Restrictions.eq("titulo",titulo));
			  crit.setMaxResults(1);
			  Tecnologia tec = (Tecnologia) crit.uniqueResult();
			return (Tecnologia) tec;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

	public Tecnologia buscarDescricao(String descricao) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria crit = session.createCriteria(Tecnologia.class);
			  crit.add(Restrictions.eq("descricao",descricao));
			  crit.setMaxResults(1);
			  Tecnologia tec = (Tecnologia) crit.uniqueResult();
			return (Tecnologia) tec;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

}
