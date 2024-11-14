/*
    Programa que pida un número entero entre 1 y 12 (mes del año)
    e indique si ese mes tiene 31, 30 o menos días.
    (No hace falta comprobar bisiestos)
 */
package diames;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class DiaMes {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    System.out.println("Introduce un numero entre [1-12]:");
    int mes = tec.nextInt();
    switch (mes) {
      case 1, 3, 5, 7, 9, 11:
        System.out.println("30 dias");
        break;
      case 2:
        System.out.println("Tiene 28 o 29 dias");
        break;
      case 4, 6, 8, 10, 12:
        System.out.println("31 dias");
        break;
    }
  }
}
