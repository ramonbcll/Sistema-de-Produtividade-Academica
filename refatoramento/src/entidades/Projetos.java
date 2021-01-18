package entidades;


public class Projetos {
    String titulo, dataInicio, dataTermino, status, agencia, objetivo, descricao;
    int valor;

    public Projetos(String titulo, String dataInicio, String dataTermino, String status, String agencia, int valor, String objetivo, String descricao) {
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataTermino  = dataTermino;
        this.status = status;
        this.agencia = agencia;
        this.valor = valor;
        this.objetivo = objetivo;
        this.descricao = descricao;
    }
}

