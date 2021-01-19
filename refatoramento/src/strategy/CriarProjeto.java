package strategy;

import entidades.Pessoas;
import entidades.Projetos;
import exceptions.Exceptions;
import main.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class CriarProjeto implements MenuStrategy {
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    Exceptions exceptions = new Exceptions();
    AddPessoasProjeto addPessoasProjeto = new AddPessoasProjeto();

    @Override
    public void execute(ArrayList<Pessoas> pessoas, ArrayList<Projetos> projetos) {

        System.out.println("SE DESEJAR INFORMACOES POSTERIORMENTE, DIGITE APENAS UM (X)");
        System.out.println("TITULO DO PROJETO:");
        String titulo = input.nextLine();
        System.out.println("DATA DE INICIO:");
        String dataInicio = input.nextLine();
        System.out.println("DATA DE TERMINO:");
        String dataTermino = input.nextLine();
        System.out.println("STATUS:");
        String status = exceptions.statusInput();
        System.out.println("AGENCIA:");
        String agencia = input.nextLine();
        System.out.println("VALOR:");
        String valor = input.nextLine();
        System.out.println("OBJETIVO:");
        String lixo = input.nextLine();
        String objetivo = input.nextLine();
        System.out.println("DESCRICAO:");
        String descricao = input.nextLine();

        projetos.add(new Projetos(titulo, dataInicio, dataTermino, status, agencia, valor, objetivo, descricao));
        addPessoasProjeto.cadastrar(pessoas, projetos, titulo);
        return;
    }
}
