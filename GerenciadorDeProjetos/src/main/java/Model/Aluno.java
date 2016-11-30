package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idAluno;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "periodo", length = 2, nullable = false)
	private String periodo;
	
	@Column(name = "matricula", length = 13, nullable = false)
	private String matricula;
	
	@ManyToOne
	@JoinColumn(name = "idProjeto")
	private Projeto projeto;
	

	public long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(long idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	
}
