package entidades;


public class Professor extends Pessoas {
    int siape;

    public Professor(String nome, String email, String titulo, int siape, String projeto1, String projeto2) {
        super(nome, email, titulo, projeto1, projeto2);
        this.siape = siape;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    @Override
    public String toString() {
        return super.toString() +"Matricula = '" + getSiape() + '\'';
    }
}
