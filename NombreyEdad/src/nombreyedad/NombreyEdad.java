/*
    Este programa tiene que pedir el nombre y el año de nacimiento
    y tiene que mostrar el nombre y la edad
 */
package nombreyedad;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class NombreyEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce tu nombre y año de nacimiento: ");

        Scanner tec = new Scanner(System.in);
        String nombre = tec.nextLine();

        int ano = tec.nextInt();

        System.out.println("Te llamas " + nombre);
        ano = 2024 - ano;
        System.out.println("Tienes " + ano + " años");
    }

}
