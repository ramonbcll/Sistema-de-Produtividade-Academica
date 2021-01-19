package strategy;

import entidades.Pessoas;
import entidades.Projetos;

import java.util.ArrayList;
import java.util.Scanner;

public class AlterarStatus implements MenuStrategy {
    Scanner input = new Scanner(System.in);

    public void verificarProjeto(ArrayList<Projetos> p, int i) {
        if(p.get(i).getTitulo().equalsIgnoreCase("x")) {
            System.out.println("O projeto nao possui todos os dados basicos para alterar o status.");
            System.out.println("Digite a baixo o TITULO:");
            p.get(i).setTitulo(input.nextLine());
        }
        if(p.get(i).getDataInicio().equalsIgnoreCase("x")) {
            System.out.println("O projeto nao possui todos os dados basicos para alterar o status.");
            System.out.println("Digite a baixo a DATA DE INICIO (SOMENTE NUMEROS):");
            p.get(i).setDataInicio(input.nextLine());
        }
        if(p.get(i).getDataTermino().equalsIgnoreCase("x")) {
            System.out.println("O projeto nao possui todos os dados basicos para alterar o status.");
            System.out.println("Digite a baixo a DATA DE TERMINO (SOMENTE NUMEROS):");
            p.get(i).setDataTermino(input.nextLine());
        }
        if(p.get(i).getStatus().equalsIgnoreCase("x")) {
            System.out.println("O projeto nao possui todos os dados basicos para alterar o status.");
            System.out.println("Digite a baixo o STATUS:");
            p.get(i).setStatus(input.nextLine());
        }
        if(p.get(i).getAgencia().equalsIgnoreCase("x")) {
            System.out.println("O projeto nao possui todos os dados basicos para alterar o status.");
            System.out.println("Digite a baixo a AGENCIA FINANCIADORA:");
            p.get(i).setAgencia(input.nextLine());
        }
        if(p.get(i).getValor().equalsIgnoreCase("x")) {
            System.out.println("O projeto nao possui todos os dados basicos para alterar o status.");
            System.out.println("Digite a baixo o VALOR FINANCIADO:");
            p.get(i).setValor(input.nextLine());
        }
        if(p.get(i).getObjetivo().equalsIgnoreCase("x")) {
            System.out.println("O projeto nao possui todos os dados basicos para alterar o status.");
            System.out.println("Digite a baixo o OBJETIVO:");
            p.get(i).setObjetivo(input.nextLine());
        }
        if(p.get(i).getDescricao().equalsIgnoreCase("x")) {
            System.out.println("O projeto nao possui todos os dados basicos para alterar o status.");
            System.out.println("Digite a baixo a DESCRICAO:");
            p.get(i).setDescricao(input.nextLine());
        }
        return;
    }

    @Override
    public void execute(ArrayList<Pessoas> pessoas, ArrayList<Projetos> projetos) {

        System.out.println("Digite o nome COMPLETO do projeto que desejar realizar alteracoes no status");
        String nome = input.nextLine();

        for(int i = 0; i < projetos.size(); i++) {
            if(nome.equalsIgnoreCase(projetos.get(i).getTitulo())) {
                System.out.println("Projeto encontrado!");
                verificarProjeto(projetos, i);
                if(projetos.get(i).getStatus().equalsIgnoreCase("em elaboracao")) {
                    System.out.println("Voce pode apenas mudar o status desse projeto para EM ANDAMENTO\n"+
                                        "[1] Para alterar\n"+
                                        "[2] Para nao alterar\n"+
                                        "[3] Sair para o menu");
                    int option = input.nextInt();
                    if(option == 1) {
                        projetos.get(i).setStatus("Em andamento");
                        System.out.println("Alteracao feita com sucesso.");
                    }
                    else if(option == 2){
                        execute(pessoas, projetos);
                    }
                    else if(option == 3) {
                        return;
                    }
                }
                else if(projetos.get(i).getStatus().equalsIgnoreCase("em andamento")) {
                    if(projetos.get(i).getPublicacoes() == null) {
                        System.out.println("O projeto nao possui publicacoes, nao e possivel alterar o status, adicione publicacoes a ele.");
                        return;
                    }
                    else {
                        System.out.println("Voce pode apenas mudar o status desse projeto para CONCLUIDO\n " +
                                "[1] Para alterar\n " +
                                "[2] Para nao alterar\n " +
                                "[3] Sair para o menu");
                        int option = input.nextInt();
                        if(option == 1) {
                            projetos.get(i).setStatus("Concluido");
                            System.out.println("Alteracao feita com sucesso.");
                        }
                        else if(option == 2){
                            execute(pessoas, projetos);
                        }
                        else if(option == 3) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
