package com.sistema.vendas.apresentacao;

import com.sistema.vendas.negocio.CustosService;
import com.sistema.vendas.persistencia.Produto;
import com.sistema.vendas.persistencia.ProdutoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;
    private final CustosService custosService;

    public ProdutoController(ProdutoRepository produtoRepository, CustosService custosService) {
        this.produtoRepository = produtoRepository;
        this.custosService = custosService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> buscarDetalhesProduto(@PathVariable Long id) {
        return produtoRepository.findById(id)
                .map(produto -> {
                    double precoVenda = custosService.calcularPrecoVenda(produto);
                    double valorLucro = custosService.calcularValorLucro(produto);
                    ProdutoDTO dto = new ProdutoDTO(
                            produto.getId(),
                            produto.getNome(),
                            produto.getPrecoCusto(),
                            precoVenda,
                            valorLucro,
                            produto.getMargemLucro() * 100
                    );
                    return ResponseEntity.ok(dto);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }
}
