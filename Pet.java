package petshow;

public class Pet {
	String nome, raca, porte;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public void cadastrarPet(String nome, String raca, String porte) {
		setNome(nome);
		setRaca(raca);
		setPorte(porte);
	}
	
	public void mostrarPet() {
		System.out.println("Nome do pet: " + getNome() + " raca: " + getRaca() + " porte: " + getPorte());
	}

}
