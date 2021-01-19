package entidades;


public class Pessoas {
    private String nome, email, titulo, projeto1, projeto2;

    public Pessoas(String nome, String email, String titulo, String projeto1, String projeto2) {
        this.nome = nome;
        this.email = email;
        this.titulo = titulo;
        this.projeto1 = null;
        this.projeto2 = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProjeto1() {
        return projeto1;
    }

    public void setProjeto1(String projeto1) {
        this.projeto1 = projeto1;
    }

    public String getProjeto2() {
        return projeto2;
    }

    public void setProjeto2(String projeto2) {
        this.projeto2 = projeto2;
    }

    @Override
    public String toString() {
        return "Nome = '" + nome + "\'\n" +
                "Email = '" + email + "\'\n" +
                "Titulo = '" + titulo + "\'\n" +
                "Projeto 1 = '" + projeto1 + "\'\n" +
                "Projeto 2 = '" + projeto2 + "\'\n";
    }
}
