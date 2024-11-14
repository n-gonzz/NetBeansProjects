/*
    Imprimir los números impares entre 1-10 utilizando un bucle while
 */
package impareswhile;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class ImparesWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a = 1;

        while (a < 11) {
            System.out.println(a);
            a += 2;
        }

    }

}
