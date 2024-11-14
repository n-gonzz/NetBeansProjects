/*
    Programa que imprima los numeros del 1-10 que sean impares con while y do-while
 */
package impares;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Impares {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num = 1;
        while (num < 10) {
            System.out.println(num);
            num += 2;
        }

        num = -1;
        do {
            num += 2;
            System.out.println(num);
        } while (num < 9);

        for (int nombre = 1;; ++nombre) {
            System.out.println("Nico");
        }

    }

}
