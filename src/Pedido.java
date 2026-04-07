public class Pedido {
    String descricao;
    double valorUnitario;
    int quantidade;

    public Pedido(String descricao, double valorUnitario, int quantidade) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;

    }

    double calcularTotalItem() {
        return valorUnitario * quantidade;
    }
}
