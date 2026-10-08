import apresentacao.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        
        controller.exibirDetalhesProduto(1);
        System.out.println();
        controller.exibirDetalhesProduto(2);
    }
}
