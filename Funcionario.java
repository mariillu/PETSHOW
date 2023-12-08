package petshow;

public class Funcionario {
		String nome;
		Servicos servicos;
		String telefone;
		
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getServicos() {
		return servicos.nome;
	}
	
	public void setServicos(Servicos servicos) {
		this.servicos = servicos;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void cadastrarFuncionario(String nome, Servicos servicos, String telefone) {
		setNome(nome);
		setServicos(servicos);
		setTelefone(telefone);
	}
	
	public void mostrarFuncionario() {
		System.out.println("Nome do funcionário: " + getNome() + " telefone: " + getTelefone() + " serviço: " + getServicos());
	}
}
