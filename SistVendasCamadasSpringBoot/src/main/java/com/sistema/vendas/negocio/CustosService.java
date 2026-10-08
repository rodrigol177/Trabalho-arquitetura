package com.sistema.vendas.negocio;

import com.sistema.vendas.persistencia.Produto;
import org.springframework.stereotype.Service;

@Service
public class CustosService {

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
