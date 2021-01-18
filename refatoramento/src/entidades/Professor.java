package entidades;


public class Professor extends Pessoas {
    int siape;

    public Professor(String nome, String email, String titulo, int siape) {
        super(nome, email, titulo);
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
        return super.toString() +"[SIAPE]--" + getSiape();
    }
}
