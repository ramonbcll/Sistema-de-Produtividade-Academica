package refatoramentoNovo;

import java.util.Scanner;
import java.util.ArrayList;
import refatoramentoNovo.Pessoas;

public class CriarPessoas {
    public static void main(String[]args) {
        ArrayList<Pessoas>pessoas = new ArrayList<Pessoas>();
        Scanner input = new Scanner(System.in);

        System.out.println("NOME:");
        String nome = input.nextLine();
        System.out.println("E-MAIL:");
        String email = input.nextLine();
        System.out.println("TITULO:");
        String titulo = input.nextLine();
        String lixo = input.nextLine();
        if(titulo.equalsIgnoreCase("professor")) {
            System.out.println("SIAPE:");
            int siape = input.nextInt();
            pessoas.add(new Professor(nome, email, titulo, siape));
        }
        else {
            System.out.println("MATRICULA:");
            int matricula = input.nextInt();
            pessoas.add(new Aluno(nome, email, titulo, matricula));
        }
        System.out.println("Colaborador cadastrado com sucesso.");
    }
}