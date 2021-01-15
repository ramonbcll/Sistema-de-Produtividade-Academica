package refatoramentoNovo;

public class Professor extends Pessoas {
    int siape;

    public Professor(String nome, String email, String titulo, int siape) {
        super(nome, email, titulo);
        this.siape = siape;
    }
}
