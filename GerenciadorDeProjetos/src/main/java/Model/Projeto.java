package Model;

import java.util.ArrayList;
import java.util.Date;

public class Projeto {
	
	private Professor prof;
	private Date dataInicio;
	private Date dataFinal;
	private String areaRelacionada;
	private String titulo;
	private String descricao;
	private ArrayList<String> links;
	
	public Projeto(ProjetoBuilder builder){
		this.prof = builder.prof;
		this.dataInicio = builder.dataInicio;
		this.dataFinal = builder.dataFinal;
		this.areaRelacionada = builder.areaRelacionada;
		this.titulo = builder.titulo;
		this.descricao = builder.descricao;
		this.links = builder.links;
	}
	
	
	public static class ProjetoBuilder{
		
		private Professor prof;
		private Date dataInicio;
		private Date dataFinal;
		private String areaRelacionada;
		private String titulo;
		private String descricao;
		private ArrayList<String> links;
		
		public ProjetoBuilder(Professor prof){
			this.prof = prof;
		}
		
		public ProjetoBuilder dataInicio(Date data){
			dataInicio = data;
			return this;
		}
		
		public ProjetoBuilder dataFinal(Date data){
			dataFinal = data;
			return this;
		}
		
		public ProjetoBuilder areaRelacionada(String area){
			areaRelacionada = area;
			return this;
		}
		
		public ProjetoBuilder titulo(String titulacao){
			titulo = titulacao;
			return this;
		}
		
		public ProjetoBuilder descricao(String descri){
			descricao = descri;
			return this;
		}
		
		public ProjetoBuilder dataInicio(String link){
			links.add(link);
			return this;
		}
		
		public Projeto builder(){
			return new Projeto(this);
		}
		
		
	}
}
