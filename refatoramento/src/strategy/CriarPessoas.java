package strategy;


import entidades.Aluno;
import entidades.Pessoas;
import entidades.Professor;
import entidades.Projetos;
import exceptions.Exceptions;
import main.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class CriarPessoas implements MenuStrategy {
    Scanner input = new Scanner(System.in);
    Exceptions exceptions = new Exceptions();
    Menu menu = new Menu();


    @Override
    public void execute(ArrayList<Pessoas> pessoas, ArrayList<Projetos> projetos) {

        System.out.println("NOME:");
        String nome = input.nextLine();
        System.out.println("E-MAIL:");
        String email = input.nextLine();
        System.out.println("TITULO:\n"+
                "[1] Professor\n"+
                "[2] Aluno");
        int tipo = exceptions.integerInput();
        while(tipo < 1 || tipo > 2) {
            System.out.println("Escolha o titulo do colaborador\n"+
                    "[1] Professor\n" +
                    "[2] Aluno");
            tipo = exceptions.integerInput();
        }
        if(tipo == 1) {
            System.out.println("SIAPE:");
            int siape = input.nextInt();
            pessoas.add(new Professor(nome, email, "professor", siape));
        }
        else if(tipo == 2) {
            System.out.println("MATRICULA:");
            int matricula = input.nextInt();
            pessoas.add(new Aluno(nome, email, "aluno", matricula));
        }
        System.out.println("Colaborador cadastrado com sucesso.");
        return;
    }
}
