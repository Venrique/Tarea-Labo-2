/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealabo2;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author victor
 */
public class Proveedor {
    private String nombre;
    private String empresa;
    
    Scanner input = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public void agregar(){
        try{
        System.out.print("\nIngrese el nombre del proveedor: ");
        setNombre(input.nextLine());
        }catch (InputMismatchException e){
            System.err.print("Error en la entrada de datos. Intentelo otra vez.\n");
            input.nextLine();
        }
    }
    
    public void eliminar(){
         try{
        System.out.print("\nIngrese el nombre del proveedor que desea eliminar: ");
        String prod = input.nextLine();
        }catch (InputMismatchException e){
            System.err.print("Error en la entrada de datos. Intentelo otra vez.\n");
            input.nextLine();
        }
    }
}
