package persistencia;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private List<Produto> bancoDeDados;

    public ProdutoDAO() {
        bancoDeDados = new ArrayList<>();
        bancoDeDados.add(new Produto(1, "Teclado Mecânico", 150.00, 0.30));
        bancoDeDados.add(new Produto(2, "Mouse Gamer", 80.00, 0.25));
    }

    public Produto buscarPorId(int id) {
        for (Produto p : bancoDeDados) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Produto> buscarTodos() {
        return bancoDeDados;
    }
}
