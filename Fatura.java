package petshow;

import java.util.ArrayList;


public class Fatura {
	private ArrayList<Servicos> servicos;
    private double valorTotal;
    
    public Fatura() {
        this.servicos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void incluirServico(Servicos servico) {
    	servicos.add(servico);
        valorTotal += servico.preco;
    }

    public ArrayList<Servicos> getServicos() {
        return servicos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

}
