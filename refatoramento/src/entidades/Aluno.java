package entidades;


public class Aluno extends Pessoas{
    int matricula;

    public Aluno(String nome, String email, String titulo, int matricula) {
        super(nome, email, titulo);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() +"[MATRICULA]--" + getMatricula();
    }
}
