/*

 */
package intercambio;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Intercambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce 2 enteros");
        Scanner tec = new Scanner(System.in);
        int a = tec.nextInt();
        int b = tec.nextInt();

        System.out.println(a);
        System.out.println(b);
    }
}
