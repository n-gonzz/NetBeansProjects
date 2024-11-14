/*

 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a = 120;
        int b = 17;

        System.out.println("a * 16 = " + a * 16);
        System.out.println("a / 4 = " + a / 4);
        System.out.println(a % 2 == 0);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println(a << 4);
        System.out.println(a >> 2);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println();
    }

}
