package entidades;


public class Pessoas {
    public String nome;
    String email, titulo, projeto1, projeto2;

    public Pessoas(String nome, String email, String titulo) {
        this.nome = nome;
        this.email = email;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "[NOME]--"+nome+"\n[E-MAIL]--"+email+"\n[TITULO]--"+titulo+"\n";
    }
}
