package view;

import business.Aluno;
//import business.Pessoa;
import business.Professor;

public class Principal {

	public static void main(String[] args) {
		//instancia a classe "Pessoa" e atribui instancia para gerar o objeto "pessoa1"
		//Pessoa pessoa1 = new Pessoa("Rubens Lara", "rl@fatec");
	
		//Exibe mensagem de saudação/cumprimento da pessoa
		//System.out.println(pessoa1.cumprimentar());
		
		Aluno aluno1 = new Aluno("João", "jp@fatec", "123");
		System.out.println(aluno1.cumprimentar());
		
		Aluno aluno2 = new Aluno("Juliana", "ju@fatec", "234");
		System.out.println(aluno2.cumprimentar());
		
		Professor professor1 = new Professor("Davi", "davi@fatec", 1111);
		System.out.println(professor1.cumprimentar());
		

		Professor professor2 = new Professor("Davi", "davi@fatec", 1111);
		System.out.println(professor2.cumprimentar("Dr."));
	}

}
