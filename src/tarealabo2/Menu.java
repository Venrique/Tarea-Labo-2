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
public class Menu {

    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void mostrar() {

        boolean bandera = true;
        while (bandera) {
            System.out.println("- -Menú- -");
            System.out.println("1)Agregar producto.");
            System.out.println("2)Eliminar producto.");
            System.out.println("3)Modificar producto.");
            System.out.println("4)Cargar producto.");
            System.out.println("5)Descargar producto.");
            System.out.println("6)Descartar producto.");
            System.out.println("7)Agregar proveedor.");
            System.out.println("8)Eliminar proveedor.");
            System.out.println("9)Salir.");

            Scanner input = new Scanner(System.in);

            try {
                System.out.print("\nDigite número de opción: ");
                int op = input.nextInt();
                
                Producto producto = new Producto();
                Proveedor proveedor = new Proveedor();
                
                switch(op){
                    case 1:
                        producto.agregar();
                        break;
                    case 2:
                        producto.eliminar();
                        break;
                    case 3:
                        producto.modificar();
                        break;
                    case 4:
                        producto.cargar();
                        break;
                    case 5:
                        producto.descargar();
                        break;
                    case 6:
                        producto.descartar();
                        break;
                    case 7:
                        proveedor.agregar();
                        break;
                    case 8:
                        proveedor.eliminar();
                        break;
                    case 9:
                        bandera=false;
                        break;
                }
                
            } catch (InputMismatchException e) {
                System.err.print("Digite una opción válida " + e);
                input.nextLine();
            }
        }
    }
}
