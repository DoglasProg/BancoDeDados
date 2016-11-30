package Model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "projetos")
public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProjeto;
	
	@Column(name = "data_inicio", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	
	@Column(name = "data_final", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataFinal;
	
	@Column(name = "area_relacionada", length = 100, nullable = false)
	private String areaRelacionada;
	
	@Column(name = "titulo", length = 50, nullable = false)
	private String titulo;
	
	@Column(name = "descricao", length = 100, nullable = false)
	private String descricao;
	
	@OneToMany(mappedBy = "projeto",cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval =true)
	private List<Tecnologia> tecnologia; 
	
	@OneToMany(mappedBy = "projeto")
	private List<Aluno> aluno;

	public long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public List<Tecnologia> getTecnologia() {
		return tecnologia;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno.add(aluno);
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getAreaRelacionada() {
		return areaRelacionada;
	}

	public void setAreaRelacionada(String areaRelacionada) {
		this.areaRelacionada = areaRelacionada;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setTecnologia(List<Tecnologia> tecnologia) {
		this.tecnologia = tecnologia;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	
	
	
}
