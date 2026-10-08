package apresentacao;

import negocio.Custos;
import persistencia.Produto;
import persistencia.ProdutoDAO;

public class Controller {

    private ProdutoDAO produtoDAO;
    private Custos custosNegocio;

    public Controller() {
        this.produtoDAO = new ProdutoDAO();
        this.custosNegocio = new Custos();
    }

    public void exibirDetalhesProduto(int id) {
        Produto produto = produtoDAO.buscarPorId(id);

        if (produto != null) {
            double precoVenda = custosNegocio.calcularPrecoVenda(produto);
            double lucro = custosNegocio.calcularValorLucro(produto);

            System.out.println("--- Detalhes do Produto ---");
            System.out.println("ID: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço de Custo: R$ " + String.format("%.2f", produto.getPrecoCusto()));
            System.out.println("Preço de Venda: R$ " + String.format("%.2f", precoVenda));
            System.out.println("Margem de Lucro: " + (produto.getMargemLucro() * 100) + "% (R$ " + String.format("%.2f", lucro) + ")");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }
}
