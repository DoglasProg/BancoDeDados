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
@Table(name = "tecnologias")
public class Tecnologia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idTecnologia;
	
	@Column(name = "titulo", length = 100, nullable = false)
	private String titulo;
	
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "tipo", length = 100, nullable = false)
	private String tipo;
	
	@Column(name = "link_componente", length = 100, nullable = false)
	private String linkComponente;
	
	@Column(name = "descricao", length = 100, nullable = false)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "idProjeto")
	private Projeto projeto;
	
	public long getIdTecnologia() {
		return idTecnologia;
	}


	public void setIdTecnologia(long idTecnologia) {
		this.idTecnologia = idTecnologia;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getLinkComponente() {
		return linkComponente;
	}


	public void setLinkComponente(String linkComponente) {
		this.linkComponente = linkComponente;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Projeto getProjeto() {
		return projeto;
	}


	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

}
