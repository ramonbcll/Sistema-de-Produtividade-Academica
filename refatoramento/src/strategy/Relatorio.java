package strategy;

import entidades.Pessoas;
import entidades.Projetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Relatorio  implements MenuStrategy {
    Scanner input = new Scanner(System.in);

    @Override
    public void execute(ArrayList<Pessoas> pessoas, ArrayList<Projetos> projetos) {
        int e = 0, a = 0, c = 0;
        System.out.println("Informacoes do laboratorio:");
        System.out.println("Total de colaboradores: " + pessoas.size());
        for (Projetos pj : projetos) {
            if(pj.getStatus().equalsIgnoreCase("em elaboracao")) {
                e += 1;
            }
            else if(pj.getStatus().equalsIgnoreCase("em andamento")) {
                a += 1;
            }
            else if(pj.getStatus().equalsIgnoreCase("concluido")) {
                c += 1;
            }
        }
        System.out.println("Projetos em elaboracao: " + e);
        System.out.println("Projetos em andamento: " + a);
        System.out.println("Projetos concluidos: " + c);
        System.out.println("Total de projetos: " + projetos.size());

        System.out.println("Digite o nome do projeto que deseja obter informacoes:");
        String nome = input.nextLine();

        for (Projetos pj : projetos) {
            if(nome.equalsIgnoreCase(pj.getTitulo())) {
                System.out.println(pj);
                return;
            }
        }
        System.out.println("Projeto nao cadastrado no banco de dados.");
    }
}
