package petshow;

import java.util.Scanner;

public class Agendamento {
	boolean[] horarios = new boolean[10];
	
	public boolean agendar() {
		for (int i = 0; i < horarios.length; i++) {
            horarios[i] = true; 
        }
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite o horário desejado (9-18) ou digite sair: ");
            String horario = scanner.next();
            
            if (horario.equals("sair")) {
                break;
            }
            
            int horarioInt = Integer.valueOf(horario);
            
            if (horarioInt >= 9 && horarioInt <= 18) {
                int indice = horarioInt - 9;
                
                if (horarios[indice]) {
                    System.out.println("Horário marcado com sucesso.");
                    horarios[indice] = false; 
                    
                    return true;
                } else {
                    System.out.println("Este horário já está ocupado. Escolha outro horário."); 
                }
            } else {
                System.out.println("Horário inválido. Digite um horário entre 9 e 18.");
            }
        }
        return false;
	}
   
	public void listarHorarios() {
		System.out.println("Horários marcados:");
        
        for (int i = 0; i < horarios.length; i++) {
            if (!horarios[i]) {
                int horario = i + 9;
                System.out.println(horario + "h");
            }
        }
	}
}