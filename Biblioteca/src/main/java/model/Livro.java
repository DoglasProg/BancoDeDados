package model;

public class Livro {
	
	private String id;
	private String autor;
	private String titulo;
	private String edicao;
	
	public Livro(String id, String autor, String titulo, String edicao) {
		this.id = id;
		this.autor = autor;
		this.titulo = titulo;
		this.edicao = edicao;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEdicao() {
		return edicao;
	}

	public String getId() {
		return id;
	}
	
	
	
	

}
