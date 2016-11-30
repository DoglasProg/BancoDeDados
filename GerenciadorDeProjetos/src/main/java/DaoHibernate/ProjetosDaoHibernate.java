package DaoHibernate;

import java.util.Date;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import Model.Aluno;
import Model.Projeto;

public class ProjetosDaoHibernate {

	public void salvar(Projeto proj) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(proj);
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

	public void excluir(Projeto proj) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.delete(proj);
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

	public void atualizar(Projeto proj) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.update(proj);
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
	public List<Projeto> listar() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria consulta = session.createCriteria(Projeto.class);
			List<Projeto> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

	public Projeto buscarTitulo(String termoBusca) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria crit = session.createCriteria(Projeto.class);
			crit.add(Restrictions.eq("titulo", termoBusca));
			crit.setMaxResults(1);
			Projeto proj = (Projeto) crit.uniqueResult();
			return (Projeto) proj;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("deprecation")
	public List<Projeto> buscarDataInicio(Date data) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria crit = session.createCriteria(Projeto.class);
			crit.add(Restrictions.eq("dataInicio", data));
			List list = crit.list();
			return list;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

	public List<Projeto> buscarDataFinal(Date dataFinal) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria crit = session.createCriteria(Projeto.class);
			crit.add(Restrictions.eq("dataFinal", dataFinal));
			List list = crit.list();
			return list;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

	public Projeto buscarResponsavel(long id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			Criteria crit = session.createCriteria(Projeto.class);
			crit.add(Restrictions.eq("idProjeto", id));
			crit.setMaxResults(1);
			Projeto proj = (Projeto) crit.uniqueResult();
			return (Projeto) proj;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			session.close();
		}
	}

}
