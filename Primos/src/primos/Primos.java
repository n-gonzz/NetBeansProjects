/*
    Programa que pida números enteros hasta recibir un cero como entrada.
    Para cada número indicar si es o no primo.
    Recordad que los primos son los naturales mayores que 1 que tienen exactamente dos divisiores.
    Además al finalizar debe impirmir cual es la media de los números introducidos.
 */
package primos;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Primos {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    System.out.println("Introduce un número natural. Introduce un 0 para detener el programa.");

    int num;
    int suma = 0;
    int contador = 0;

    while (true) {
      num = tec.nextInt();
      if (num == 0) {
        break;
      }
      suma += num;
      contador++;

      if (num < 2) {
        System.out.println("No es primo");
      } else {
        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
          if (num % i == 0) {
            primo = false;
            break;
          }
        }
        if (primo) {
          System.out.println("Es primo");
        } else {
          System.out.println("No es primo");
        }
      }
    }

    if (contador > 0) {
      double media = (double) suma / contador;
      System.out.println("La media de los números introducidos es " + media);
    } else {
      System.out.println("No se introdujeron números.");
    }
  }
}
