package main;

import entidades.Pessoas;
import entidades.Projetos;
import strategy.MenuStrategy;
import strategy.TypeMenu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public Scanner input = new Scanner(System.in);
    ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();
    ArrayList<Projetos>projetos = new ArrayList<Projetos>();

    public void start() {
        int option;
        System.out.println("\nDigite a opcao que deseja para acessar no laboratorio:\n"+
                " [1] Cadastrar colaborador\n"+
                " [2] Pesquisar colaborador\n"+
                " [3] Cadastrar projeto\n"+
                " [4] Pesquisar projeto\n"+
                " [5] Adicionar publicacao a um projeto\n"+
                " [6] Relatorio de informacoes\n"+
                " [7] Sair");
        try {
            option = input.nextInt();
            while(option < 0 || option >= 8) {
                System.out.println("Escolha um numero de 1 a 7");
                option = input.nextInt();
            }
            TypeMenu typeMenu = TypeMenu.values()[option - 1];
            MenuStrategy menuStrategy = typeMenu.obterMenu();
            menuStrategy.execute(pessoas, projetos);
            start();
        }
        catch(InputMismatchException e) {
            input.nextLine();
            System.out.println("Digite apenas um numero das opcoes.");
            start();
        }
    }
}
