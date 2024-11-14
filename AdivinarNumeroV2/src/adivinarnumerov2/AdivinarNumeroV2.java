/*
  Programa  que escoja al azar un número entre uno y 100.
  El usuario debe adivinar el número. Se le dará como pista
  información de si el número indicado es mayor o menor que
  el número a adivinar.
  El programa finaliza cuando se adivina el número, indicando
  que se ha encontrado y en cuantos intentos se ha realizado.
 */
package adivinarnumerov2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Nicolás González Dobarro
 */
public class AdivinarNumeroV2 {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    int random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
    int num;
    int contador = 0;
    while (true) {

//    System.out.println("Numero Random: " + random);
      System.out.println("Adivina el numero [1-100]:");
      num = tec.nextInt();
      contador++;

      if (num > random) {
        System.out.println(num + " es mayor que el numero aletatorio");
      } else if (num < random) {
        System.out.println(num + " es menor que el numero aletatorio");
      } else {
        System.out.println("Has adivinado el numero en " + contador + " intentos");
        break;
      }
    }
  }
}
