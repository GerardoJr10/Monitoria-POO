import java.util.ArrayList;

public class GestaoPedidos {
    private ArrayList<String> pedidos;

    public GestaoPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String item) {
        pedidos.add(item);
    }

    public String proximoPedido() {
        if (pedidos.isEmpty()) {
            return "Fila Vazia";
        }
        return pedidos.remove(0);
    }

    public int quantidadePendentes() {
        return pedidos.size();
    }

    public void listarPedidos() {
        for (String pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    public static void main(String[] args) {
        GestaoPedidos gestao = new GestaoPedidos();

        gestao.adicionarPedido("Pizza Margherita");
        gestao.adicionarPedido("Suco de Laranja");
        gestao.adicionarPedido("Salada Caesar");

        System.out.println("Pedidos atuais:");
        gestao.listarPedidos();

        String removido = gestao.proximoPedido();
        System.out.println("\nPedido removido: " + removido);

        System.out.println("Pedidos restantes: " + gestao.quantidadePendentes());
    }
}
