package tarealabo2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class LogIn {

    private String pass;
    private String user;

    /**
     * Pregunta el nombre de usuario y contraseña. Luego verifica el archivo
     * usuario.txt para validar.
     */
    public void PedirCredenciales() {

        Scanner input = new Scanner(System.in);
        

        while (true) {

            System.out.println("Ingrese su usuario: ");
            this.user = input.nextLine();

            System.out.println("Ingrese su contraseña: ");
            this.pass = input.nextLine();

            Path dir = Paths.get("usuario.txt");

            try {
                byte[] lecturaByte = Files.readAllBytes(dir);

                String lecturaString = new String(lecturaByte, "ISO-8859-1");
                String[] credenciales = lecturaString.split(",");

                if (this.user.equals(credenciales[0].trim()) && this.pass.equals(credenciales[1].trim())) {
                    System.out.println("Bienvenid@ " + this.user);
                    break;
                } else {
                    System.out.println("Error. Revise sus datos");
                    System.out.println("");
                }

            } catch (IOException e) {
                System.out.println(e);
            }

        }
    }

}
