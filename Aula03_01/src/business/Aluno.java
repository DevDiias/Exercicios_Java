package business;

public class Aluno extends Pessoa {
	private String ra;

	public String getRa() {
		return ra;
	}

	public Aluno(String nome, String email, String ra) {
		//executa o construtor não-default da classe pai
		super(nome, email);
		this.ra= ra;
	}
	
}
