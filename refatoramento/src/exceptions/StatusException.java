package exceptions;

public class StatusException extends Exception {
    private String status;

    public StatusException(String status) {
        super();
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status negado, so sao aceitos projetos EM ELABORACAO";
    }
}
