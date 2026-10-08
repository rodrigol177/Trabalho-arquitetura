package com.sistema.vendas.apresentacao;

public class ProdutoDTO {
    private Long id;
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double valorLucro;
    private double margemLucroPercentual;

    public ProdutoDTO(Long id, String nome, double precoCusto, double precoVenda, double valorLucro, double margemLucroPercentual) {
        this.id = id;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.valorLucro = valorLucro;
        this.margemLucroPercentual = margemLucroPercentual;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public double getPrecoCusto() { return precoCusto; }
    public double getPrecoVenda() { return precoVenda; }
    public double getValorLucro() { return valorLucro; }
    public double getMargemLucroPercentual() { return margemLucroPercentual; }
}
