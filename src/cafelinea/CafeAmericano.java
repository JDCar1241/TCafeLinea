/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafelinea;

public class CafeAmericano implements Cafe {

    @Override
    public String getDescripcion() {
        return "Cafe Americano";
    }

    @Override
    public double getPrecio() {
        return 7.00;
    }
}