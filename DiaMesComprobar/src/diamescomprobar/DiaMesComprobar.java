/*
    Completar el programa que indica los días que tiene un mes,
    asegurándose de que el usuario no introduzca un mes no válido,
    en cuyo caso se le volverá a pedir hasta que introduzca uno correcto.
 */
package diamescomprobar;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class DiaMesComprobar {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    System.out.println("Introduce un numero entre [1-12]:");
    while (true) {
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
        default:
          System.out.println("Introduce un numero valido entre [1-12]:");
          break;
      }
    }
  }
}
