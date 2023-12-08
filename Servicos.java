package petshow;

public class Servicos {
	String nome;
	double preco;
	int codigo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void cadastrarServico(String nome, double preco, int codigo) {
		setNome(nome);
		setPreco(preco);
		setCodigo(codigo);
	}
	
	public void mostrarServico() {
		System.out.println("Nome do serviço: " + getNome() + " preço: " + getPreco() + " Código: " + getCodigo());
	}
	
}
