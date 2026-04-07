void main() {
    Cliente client = new Cliente("Jonas Azevedo", 3);
    Pedido p1 = new Pedido("Lasanha", 15.5, 1);
    Pedido p2 = new Pedido("Refrigerante 2L", 10, 2);
    Pedido p3 = new Pedido("Sobremesa", 29.9, 1);

    ContaRestaurante conta = new ContaRestaurante(client, p1, p2, p3);
    conta.imprimir();

    Cliente client2 = new Cliente("Adalberto Silva", 1);
    Pedido i1 = new Pedido("Strogonoff", 20, 1);
    Pedido i2 = new Pedido("Refrigerante 2L", 10, 1);
    Pedido i3 = new Pedido("Mousse de Limão", 12.5, 3);

    ContaRestaurante conta2 = new ContaRestaurante(client2, i1, i2, i3);
    conta2.imprimir();
}