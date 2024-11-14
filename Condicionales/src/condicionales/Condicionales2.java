/*

 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Condicionales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int nota = tec.nextInt();
        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota < 7) {
            System.out.println("Notable");
        }

    }

}
