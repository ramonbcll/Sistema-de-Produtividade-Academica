package refatoramentoNovo;

import java.util.Scanner;
import java.util.InputMismatchException;
import refatoramento.Pessoas;
import refatoramento.Laboratorio;
import refatoramento.Relatorio;

public class Menu {
    public Scanner input = new Scanner(System.in);
    Pessoas colabora = new Pessoas();
    Laboratorio lab = new Laboratorio();
    Relatorio rel = new Relatorio();

    public void start() {
        int option;
            System.out.println("\nDigite a opcao que deseja para acessar no laboratorio:\n"+
            " [1] Colaboradores\n"+
            " [2] Projetos\n"+
            " [3] Relatorios dos laboratorios\n"+
            " [4] Sair");
            try {
                option = input.nextInt();
                if(option == 1) {
                    colabora.colaboradores();
                }
                else if(option == 2) {
                    lab.projetos();
                }
                else if(option == 3) {
                    rel.relatorios();
                }
                else if(option == 4) {
                    System.exit(0);
                }
                else {
                    System.out.println("Opcao invalida.");
                }
            }
            catch(InputMismatchException e) {
                input.nextLine();
                System.out.println("Digite apenas um numero das opcoes.");
                start();
            }
        start();
    }
}
