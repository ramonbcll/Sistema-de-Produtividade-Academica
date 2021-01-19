package strategy;

import entidades.Pessoas;
import entidades.Projetos;
import exceptions.Exceptions;
import util.Verificador;

import java.util.ArrayList;
import java.util.Scanner;

public class AddPessoasProjeto {
    Exceptions exceptions = new Exceptions();
    Verificador verificador = new Verificador();
    Scanner input = new Scanner(System.in);

    public void cadastrar(ArrayList<Pessoas> pessoas, ArrayList<Projetos> projetos, String titulo) {
        System.out.println("Quantos colaboradores o projeto tera: (MIN 1/MAX 4)");
        int total = exceptions.integerInput(), nProfessor = 0, nAlunos = 0;
        while(total < 1 || total > 4) {
            System.out.println("Escolha somente de 1 a 4");
            total = exceptions.integerInput();
        }
        for(int i = 0; i < total; i++) {
            System.out.println("Digite o nome do colaborador que deseja adicionar:");
            String nome = input.nextLine();
            boolean statusPessoa = verificador.verificarDados(nome, pessoas);
            boolean totalProjetosPessoa = verificador.projetosPessoa(nome, pessoas);
            if(statusPessoa) {
                for (Pessoas p : pessoas) {
                    if (p.getNome().equalsIgnoreCase(nome) && p.getTitulo().equalsIgnoreCase("professor")) {
                        if (nProfessor < 2) {
                            if (p.getProjeto1() == null) {
                                p.setProjeto1(titulo);
                                nProfessor += 1;
                                System.out.println("Professor cadastrado no projeto com sucesso.");
                            }
                            else if (p.getProjeto2() == null) {
                                p.setProjeto2(titulo);
                                nProfessor += 1;
                                System.out.println("Professor cadastrado no projeto com sucesso.");
                            }
                            for (int j = 0; j < total; j++) {
                                if (projetos.get(projetos.size() - 1).getColaborador(j) == null) {
                                    projetos.get(projetos.size() - 1).setColaborador(j, nome);
                                    break;
                                }
                            }
                            break;
                        }
                    } else if (p.getNome().equalsIgnoreCase(nome) && p.getTitulo().equalsIgnoreCase("aluno") && nProfessor >= 1) {
                        if (nAlunos < 2) {
                            if (p.getProjeto1() == null) {
                                p.setProjeto1(titulo);
                                nAlunos += 1;
                                System.out.println("Aluno cadastrado no projeto com sucesso.");
                            } else if (p.getProjeto2() == null) {
                                p.setProjeto2(titulo);
                                nAlunos += 1;
                                System.out.println("Aluno cadastrado no projeto com sucesso.");
                            }
                            for (int j = 0; j < total; j++) {
                                if (projetos.get(projetos.size() - 1).getColaborador(j) == null) {
                                    projetos.get(projetos.size() - 1).setColaborador(j, nome);
                                    break;
                                }
                            }
                            break;
                        }
                    } else if (p.getNome().equalsIgnoreCase(nome)) {
                        System.out.println("O colaborador nao e um professor, primeiro cadastre pelo menos um professor no projeto.");
                        i -= 1;
                    }
                }
            }
            else if(statusPessoa && !(totalProjetosPessoa)) {
                System.out.println("Esse colaborador nao pode participar de mais projetos.");
                i -= 1;
            }
            else if(!(statusPessoa)) {
                System.out.println("Colaborador nao encontrado no banco de dados.");
                i -= 1;
            }

            if(nAlunos == 2) {
                System.out.println("Voce nao pode adicionar mais alunos ao projeto.");
            }
            else if(nProfessor == 2) {
                System.out.println("Voce nao pode adicionar mais professores ao projeto.");
            }
        }
    }
}
