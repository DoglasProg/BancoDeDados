package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
@SequenceGenerator(name = "alunos_idaluno_seq", sequenceName = "alunos_idaluno_seq", allocationSize =1,
initialValue = 1)
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "alunos_idaluno_seq")
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
	
	public Aluno(String nome, String periodo, String matricula) {
		this.nome = nome;
		this.periodo = periodo;
		this.matricula = matricula;
	}

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
