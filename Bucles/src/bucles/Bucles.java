/*

 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a;
        System.out.println("Introduce un numero entero. No positivo para terminar.");
        a = tec.nextInt();
        while (a > 0) {
            System.out.println(a);
            a = tec.nextInt();
        }

        System.out.println("Finalizando... a no es positivo");

    }

}
