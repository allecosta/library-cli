package br.com.library;

public class Author {
	
	private String name, cpf, email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void detailsAuthor() {
		System.out.println("Autor: " + name);
		System.out.println("CPF: " + cpf);
		System.out.println("E-mail: " + email);
	}

}
