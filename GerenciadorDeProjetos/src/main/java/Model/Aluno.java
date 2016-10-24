package Model;

public class Aluno {
	
	private String nome;
	private int periodo;
	private String matricula;
	
	public Aluno(String nome, int periodo, String matricula) {
		this.nome = nome;
		this.periodo = periodo;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getPeriodo() {
		return periodo;
	}

	public String getMatricula() {
		return matricula;
	}
	
	
	
}
