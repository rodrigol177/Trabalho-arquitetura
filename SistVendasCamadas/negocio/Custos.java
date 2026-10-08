package negocio;

import persistencia.Produto;

public class Custos {

    public double calcularPrecoVenda(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        return produto.getPrecoCusto() * (1 + produto.getMargemLucro());
    }

    public double calcularValorLucro(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        return produto.getPrecoCusto() * produto.getMargemLucro();
    }
}
