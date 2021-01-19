package entidades;


import java.util.Arrays;

public class Projetos {
    private String titulo, dataInicio, dataTermino, status, agencia, valor, objetivo, descricao, publicacoes;
    private String[]colaborador = new String[4];

    public Projetos(String titulo, String dataInicio, String dataTermino, String status, String agencia, String valor, String objetivo, String descricao) {
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataTermino  = dataTermino;
        this.status = status;
        this.agencia = agencia;
        this.valor = valor;
        this.objetivo = objetivo;
        this.descricao = descricao;
    }

    public String getColaborador(int x) {
        return this.colaborador[x];
    }

    public void setColaborador(int i, String colaborador) {
        this.colaborador[i] = colaborador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(String publicacoes) {
        this.publicacoes = publicacoes;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", Data de inicio='" + dataInicio + '\'' +
                ", Data de termino='" + dataTermino + '\'' +
                ", status='" + status + '\'' +
                ", agencia='" + agencia + '\'' +
                ", objetivo='" + objetivo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", colaborador(es)=" + Arrays.toString(colaborador);
    }
}

