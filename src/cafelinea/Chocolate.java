/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafelinea;

public class Chocolate extends DecoradorCafe {

    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Chocolate";
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 2.00;
    }
}