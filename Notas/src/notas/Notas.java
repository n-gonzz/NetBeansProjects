/*

 */
package notas;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce una nota:");
        Scanner tec = new Scanner(System.in);
        float nota = tec.nextInt();
        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota > 6) {
            System.out.println("Aprobado");
        }

    }
}
