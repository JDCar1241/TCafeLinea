/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafelinea;

public class Cappuccino implements Cafe {

    @Override
    public String getDescripcion() {
        return "Cappuccino";
    }

    @Override
    public double getPrecio() {
        return 9.90;
    }
}