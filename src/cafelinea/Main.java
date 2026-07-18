/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafelinea;

public class Main {

    public static void main(String[] args) {

        Cafe pedido = new CafeAmericano();

        pedido = new Leche(pedido);
        pedido = new Chocolate(pedido);
        pedido = new Crema(pedido);

        Pedido nuevoPedido = new Pedido(
                1001,
                "Jairo",
                pedido
        );

        nuevoPedido.mostrarPedido();
    }
}