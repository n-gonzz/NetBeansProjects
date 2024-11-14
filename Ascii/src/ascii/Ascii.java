/*

 */
package ascii;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Ascii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce un numero en el intervalo [32-255]");
        Scanner tec = new Scanner(System.in);

        int num = tec.nextInt();

        String ascii = Character.toString(num);
        System.out.println("ASCII: " + ascii);
    }

}
