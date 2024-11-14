/*
    Indica si el numero introducido es Mayor, Menor o Igual a 0
 */
package mayormenorigual0;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class MayorMenorIgual0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce un numero:");
        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        if (num < 0) {
            System.out.println(num + " es menor que 0");
        } else if (num == 0) {
            System.out.println(num + " es igual a 0");
        } else {
            System.out.println(num + " es mayor que 0");
        }

        String resultado = (num > 0) ? "Mayor que 0" : (num < 0) ? "Menor que 0" : "Igual a 0";

        System.out.println(resultado);
    }
}
