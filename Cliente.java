package petshow;

public class Cliente {
	String nome, email, endereco, telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void cadastrarCliente(String nome, String email,String endereco,String telefone) {		
		setTelefone(telefone);
		setNome(nome);
		setEmail(email);
		setEndereco(endereco);
		
	}
	
	public void mostrarCliente() {
		System.out.println("Nome do tutor: " + getNome() + " Telefone: " + getTelefone() + " Endereço: " + getEndereço() + " Email: " + getEmail());
	}
}
