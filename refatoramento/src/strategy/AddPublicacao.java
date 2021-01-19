package strategy;

import entidades.Pessoas;
import entidades.Projetos;

import java.util.ArrayList;
import java.util.Scanner;

public class AddPublicacao implements MenuStrategy {
    Scanner input = new Scanner(System.in);

    @Override
    public void execute(ArrayList<Pessoas> pessoas, ArrayList<Projetos> projetos) {
        System.out.println("Digite o nome do projeto que deseja adicionar publicacoes:");
        String nome = input.nextLine();
        for(int i = 0; i < projetos.size(); i++) {
            if(projetos.get(i).getTitulo().equalsIgnoreCase(nome)) {
                System.out.println("Projeto encontrado!");
                if(projetos.get(i).getPublicacoes() != null) {
                    System.out.println("O projeto ja possui publicacoes associadas a ele.");
                }
                else {
                    System.out.println("Digite as informacoes sobre a publicacao que deseja adicionar ao projeto:");
                    projetos.get(i).setPublicacoes(input.nextLine());
                    System.out.printf("Publicacao adicionada ao %s\n", projetos.get(i).getTitulo());
                }
            }
            return;
        }
        System.out.println("Projeto nao cadastrado.");
    }
}
