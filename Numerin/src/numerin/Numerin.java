/*

 */
package numerin;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Numerin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Piensa en un numero e introducelo:");
        Scanner tec = new Scanner(System.in);
        int num = tec.nextInt();
        if (num == num) {
            System.out.println("El numero en el que pensaste es " + num);
        }
    }
}
