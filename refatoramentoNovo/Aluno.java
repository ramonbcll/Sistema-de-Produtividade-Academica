package refatoramentoNovo;

public class Aluno extends Pessoas{
    int matricula;

    public Aluno(String nome, String email, String titulo, int matricula) {
        super(nome, email, titulo);
        this.matricula = matricula;
    }
}
