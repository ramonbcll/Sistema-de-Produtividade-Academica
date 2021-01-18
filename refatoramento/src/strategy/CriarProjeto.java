package strategy;

import entidades.Projetos;

import java.util.ArrayList;
import java.util.Scanner;

public class CriarProjeto {
    public static void main(String[]args) {
        ArrayList<Projetos>projetos = new ArrayList<Projetos>();
        Scanner input = new Scanner(System.in);

        System.out.println("TITULO DO PROJETO:");
        String titulo = input.nextLine();
        System.out.println("DATA DE INICIO:");
        String dataInicio = input.nextLine();
        System.out.println("DATA DE TERMINO:");
        String dataTermino = input.nextLine();
        System.out.println("STATUS:");
        String status = input.nextLine();
        System.out.println("AGENCIA:");
        String agencia = input.nextLine();
        System.out.println("VALOR:");
        int valor = input.nextInt();
        System.out.println("OBJETIVO:");
        String lixo = input.nextLine();
        String objetivo = input.nextLine();
        System.out.println("DESCRICAO:");
        String descricao = input.nextLine();

        projetos.add(new Projetos(titulo, dataInicio, dataTermino, status, agencia, valor, objetivo, descricao));
    }
}
