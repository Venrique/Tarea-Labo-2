/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealabo2;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Producto {
    
    private String nombre;
    private int cantidad;
    private float costo;
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public void agregar(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nIngrese el nombre del producto: ");
        setNombre(input.nextLine());
        
        System.out.println("\nIngrese la cantidad de producto: ");
        setCantidad(input.nextInt());
        
        System.out.println("\nIngrese el precio del producto: $");
        setCosto(input.nextFloat());
        
        
    }
}
