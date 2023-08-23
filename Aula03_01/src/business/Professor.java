package business;

public class Professor extends Pessoa {
	private int matricula;
	
	public int getMatricula() {
		return matricula;
	}

	public Professor(String nome, String email, int matricula) {
		super(nome, email);
		this.matricula = matricula;
	}

	@Override 
	public String cumprimentar() {
		//return super.cumprimentar() + "Sou seu professor.";
		return String.format("Olá, boa noite! Meu nome é professor %s!", nome);

	}

	public String cumprimentar(String tratamento) {
		//return super.cumprimentar() + "Sou seu professor.";
		return String.format("Olá, boa noite! Meu nome é professor %s %s!", tratamento,nome);

	}
	
	

}
