/*
Programa que pida un número entero mayor que 1,
e indique el total de números primos existentes
entre el número 2 y el número introducido, ambos inclusive.

Se debe imprimir también el tiempo invertido en el cálculo.
Se empezará a contar después de haber recibido un número correcto.
 */
package listadoprimos;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class ListadoPrimos {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    System.out.println("Introduce un número entero mayor que 1:");

    int num = tec.nextInt();
    if (num <= 1) {
      System.out.println("El número debe ser mayor que 1.");
      return;
    }

    int contador = 0;
    long t1 = Calendar.getInstance().getTimeInMillis();

    for (int i = 2; i <= num; i++) {
      boolean Primo = true;
      if (i < 2) {
        Primo = false;
      } else {
        for (int j = 2; j <= Math.sqrt(i); j++) {
          if (i % j == 0) {
            Primo = false;
            break;
          }
        }
      }
      if (Primo) {
        contador++;
      }
    }

    long t2 = Calendar.getInstance().getTimeInMillis();

    System.out.println("Hay un total de " + contador + " números primos existentes entre 2 y " + num);
    System.out.println("Has tardado: " + (t2 - t1) / 1000.0 + " segundos");
  }
}
