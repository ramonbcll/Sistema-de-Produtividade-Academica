package strategy;


import entidades.Pessoas;
import entidades.Projetos;

import java.util.ArrayList;
import java.util.Scanner;

public class PesquisarPessoas implements MenuStrategy {

    @Override
    public void execute(ArrayList<Pessoas> pessoas, ArrayList<Projetos> projetos) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do colaborador a pesquisar:");
        String nome = input.nextLine();
        for (Pessoas p : pessoas) {
            if(nome.equalsIgnoreCase(p.nome)) {
                System.out.println(p);
            }
        }
    }
}

