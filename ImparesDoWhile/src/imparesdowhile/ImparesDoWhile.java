/*
    Imprimir los números impares entre 1-10 utilizando un bucle do-while
 */
package imparesdowhile;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class ImparesDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un numero entre [1-10]:");
        int num = tec.nextInt();

        do {
            num *= 10;
            System.out.println(num);
        } while (num < 9);

    }

}
