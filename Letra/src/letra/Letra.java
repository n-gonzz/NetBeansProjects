/*
    Nos pide una vocal e imprime si es mayuscula, minuscula u otra cosa
 */
package letra;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Letra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce una vocal:");
        Scanner tec = new Scanner(System.in);
        String letra = tec.next();
        switch (letra) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(letra + " es mayúscula");
                break;
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letra + " es minúscula");
                break;
            default:
                System.out.println(letra + " es otra cosa");
        }
    }
}
