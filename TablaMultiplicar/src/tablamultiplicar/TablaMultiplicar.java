/*
Solicitar un número por teclado e imprimir su tabla de multiplicar (del 1 al 10)
 */
package tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class TablaMultiplicar {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    System.out.println("Introduce un numero entre [1-10]:");
    int num = tec.nextInt();

    System.out.println("La tabla multiplicar del " + num);

    for (int multiplicador = 1; multiplicador < 11; multiplicador++) {
      System.out.println(num + " x " + multiplicador + " = " + num * multiplicador);
    }
  }
}
