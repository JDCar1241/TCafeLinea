/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafelinea;

/**
 *
 * @author sistemas
 */
public class Espresso implements Cafe {
    
     @Override
    public String getDescripcion() {
        return "Cafe Espresso";
    }

    @Override
    public double getPrecio() {
        return 5.00;
    }
    
}
