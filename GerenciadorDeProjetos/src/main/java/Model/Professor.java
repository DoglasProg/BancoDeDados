package Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "professores")
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idProfessor;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "codigo", length = 13, nullable = false)
	private String codigo;
	
	@OneToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.EAGER, orphanRemoval =true)
	@PrimaryKeyJoinColumn
	private Projeto projeto;
	
	public String getNome() {
		return nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public long getIdProfessor() {
		return idProfessor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setIdProfessor(long idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	
	
}
