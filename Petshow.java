package petshow;

import java.util.Scanner;

public class Petshow {

    public static void main(String[] args) {

        int opcao = 0;
        
        Servicos servico1 = new Servicos();
        Servicos servico2 = new Servicos();
        Servicos servico3 = new Servicos();
        servico1.cadastrarServico("Banho", 50, 1);
        servico2.cadastrarServico("Tosa", 55, 2);
        servico3.cadastrarServico("Limpenza dentes", 55, 3);

        Cliente cliente = new Cliente();
        Pet pet = new Pet();
        
        Fatura fatura = new Fatura();
        
        Funcionario funcionario = new Funcionario();

        Scanner input = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Cadastrar funcionário");
            System.out.println("3 - Agendar serviço");
            System.out.println("4 - ver fatura");
            System.out.println("5 - Encerrar programa");

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                	System.out.println("Nome do pet: ");
                    String nomePet = input.nextLine();
                    
                    System.out.println("Raça: ");
                    String raca = input.nextLine();
                    
                    System.out.println("Porte: ");
                    String porte = input.nextLine();
                    
                    pet.cadastrarPet(nomePet, raca, porte);
                    
                    System.out.println("Nome do tutor: ");
                    String nomeCliente = input.nextLine();
                    
                    System.out.println("Email do tutor: ");
                    String email = input.nextLine();
                    
                    System.out.println("Endereço do tutor: ");
                    String endereco = input.nextLine();
                    
                    System.out.println("Telefone do tutor: ");
                    String telefone = input.nextLine();
                    
                    cliente.cadastrarCliente(nomeCliente, email, endereco, telefone);
                    
                    pet.mostrarPet();
                    cliente.mostrarCliente();
                    break;
                case 2:
                	
                	System.out.println("Nome do funcionário: ");
                    String nomeFuncionario = input.nextLine();
                    
                    servico1.mostrarServico();
                	servico2.mostrarServico();
                	servico3.mostrarServico();
                    
                    System.out.println("Escolha um dos serviços e insira o seu código: ");
                    int codigoServico = input.nextInt();
                    input.nextLine();
                    
                    Servicos servicoSelec = null;
                    
                    if (codigoServico == servico1.getCodigo()) {
                    	servicoSelec = servico1;
                    } else if (codigoServico == servico2.getCodigo()) {
                    	servicoSelec = servico2;
                    } else {
                    	servicoSelec = servico3;
                    }
                    
                    System.out.println("Telefone: ");
                    String telefoneFuncionario = input.nextLine();
                    
                    funcionario.cadastrarFuncionario(nomeFuncionario, servicoSelec, telefoneFuncionario);
                    funcionario.mostrarFuncionario();
                	break;
                case 3:
                	servico1.mostrarServico();
                	servico2.mostrarServico();
                	servico3.mostrarServico();
                	
                	Agendamento agendamento = new Agendamento();

                	boolean agendar = agendamento.agendar();
                	
                	if (agendar == true) {
                		System.out.print("Digite o código do serviço: ");
                        int codigo = input.nextInt();
                        
                        Servicos servicoSelecionado = null;
                        
                        if (codigo == servico1.getCodigo()) {
                        	servicoSelecionado = servico1;
                        } else if (codigo == servico2.getCodigo()) {
                        	servicoSelecionado = servico2;
                        } else {
                        	servicoSelecionado = servico3;
                        }
                        
                        if (servicoSelecionado != null) {
                            fatura.incluirServico(servicoSelecionado);
                            System.out.println("Serviço adicionado à fatura.");
                        }
                	}
                    
                	break;
                case 4:
                	System.out.println("Valor Total da fatura: " + fatura.getValorTotal());
                	break;
                case 5:
                	System.out.println("Fim!");
                	break;
                default:
                    System.out.println("Opção inválida! Digite um número válido.");
                    break;
            }

        }

    }

}
