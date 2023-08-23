package business;

abstract class Pessoa {
	protected String nome;
	private String email;
	
//construtor não default
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String cumprimentar() {
	return String.format("Olá, boa noite! Meu nome é %s!", nome);
	
	}
}
