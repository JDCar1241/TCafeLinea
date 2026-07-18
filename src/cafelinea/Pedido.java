/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafelinea;

public class Pedido {

    private int numeroPedido;
    private String cliente;
    private Cafe cafe;

    public Pedido(int numeroPedido, String cliente, Cafe cafe) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.cafe = cafe;
    }

    public void mostrarPedido() {

        System.out.println("\n========== PEDIDO ==========");
        System.out.println("Número: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + cafe.getDescripcion());
        System.out.println("Total: S/ " + cafe.getPrecio());
        System.out.println("============================");
    }
}