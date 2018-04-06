/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealabo2;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Producto {
    
    private String nombre;
    private int cantidad;
    private float costo;
    
    Scanner input = new Scanner(System.in);

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
        
        try{
        System.out.print("\nIngrese el nombre del producto: ");
        setNombre(input.nextLine());
        
        System.out.print("\nIngrese la cantidad de producto: ");
        setCantidad(input.nextInt());
        
        System.out.print("\nIngrese el precio del producto: $");
        setCosto(input.nextFloat());
        
        }catch (InputMismatchException e){
            System.err.print("Error en la entrada de datos. Intentelo otra vez.\n");
            input.nextLine();
        }
        
    }
    
    public void eliminar(){
        try{
        System.out.print("\nIngrese el nombre del producto que desea eliminar: ");
        String eliminar = input.nextLine();
       
        }catch (InputMismatchException e){
            System.err.print("Error en la entrada de datos. Intentelo otra vez.\n");
            input.nextLine();
        }
    }
    
    public void modificar(){
        try{
        System.out.print("\nIngrese el nombre del producto que desea modificar: ");
        String producto = input.nextLine();
        
        System.out.print("\nNuevo nombre: ");
        setNombre(input.nextLine());
        
        System.out.print("\nNueva cantidad de producto: ");
        setCantidad(input.nextInt());
        
        System.out.print("\nNuevo precio: ");
        setCosto(input.nextFloat());
        
        }catch (InputMismatchException e){
            System.err.print("Error en la entrada de datos. Intentelo otra vez.\n");
            input.nextLine();
        }
    }
    
    public void cargar(){
        try{
        System.out.print("\nIngrese el nombre del producto: ");
        String producto = input.nextLine();
        
        System.out.println("\nCantidad que desea agregar: ");
        int cant = input.nextInt();
        
        }catch (InputMismatchException e){
            System.err.print("Error en la entrada de datos. Intentelo otra vez.\n");
            input.nextLine();
        }
    }
    
    public void descargar(){
        try{
        System.out.print("\nIngrese el nombre del producto: ");
        String producto = input.nextLine();
       
        System.out.println("\nCantidad que desea eliminar: ");
        int cant = input.nextInt();
        
        }catch (InputMismatchException e){
            System.err.print("Error en la entrada de datos. Intentelo otra vez.\n");
            input.nextLine();
        }
    }
    
    public void descartar(){
        try{
        System.out.print("\nIngrese el nombre del producto que desea inhabilitar: ");
        String producto = input.nextLine();
        
        }catch (InputMismatchException e){
            System.err.print("Error en la entrada de datos. Intentelo otra vez.\n");
            input.nextLine();
        }
    }
}
