package persistencia;

public class Produto {
    private int id;
    private String nome;
    private double precoCusto;
    private double margemLucro; // Exemplo: 0.20 para 20%

    public Produto() {}

    public Produto(int id, String nome, double precoCusto, double margemLucro) {
        this.id = id;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
}
