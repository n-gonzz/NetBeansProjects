/*
    Pedir un número de mes por teclado e imprimir si estamos en primavera,
    verano, otoño o invierno. Si coincide con un mes en que hay cambio de estaciones,
    que aparacezcan ambas.
 */
package estacionano;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class EstacionAno {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un mes entre [1-12]:");
        while (true) {
            int mes = tec.nextInt();
            switch (mes) {
                case 1, 2:
                    System.out.println("Invierno");
                    break;
                case 3:
                    System.out.println("Invierno-Primavera");
                    break;
                case 4, 5:
                    System.out.println("Primavera");
                    break;
                case 6:
                    System.out.println("Primavera-Verano");
                    break;
                case 7, 8:
                    System.out.println("Verano");
                    break;
                case 9:
                    System.out.println("Verano-Otoño");
                    break;
                case 10, 11:
                    System.out.println("Otoño");
                    break;
                case 12:
                    System.out.println("Otoño-Invierno");
                    break;
                default:
                    System.out.println("Introduce un mes valido entre [1-12]:");
                    break;
            }

        }
    }
}
