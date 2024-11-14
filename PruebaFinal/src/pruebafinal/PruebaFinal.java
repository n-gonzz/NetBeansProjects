/*

 */
package pruebafinal;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class PruebaFinal {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    System.out.println("Construye el rotulador");

    System.out.print("Color: ");
    String color = tec.nextLine();

    System.out.print("Capacidad: ");
    double capacidad = tec.nextDouble();

    System.out.print("Precio: ");
    double precio = tec.nextDouble();

    Rotulador r = new Rotulador(color, capacidad, precio);
    System.out.println("------------------------------------");
    System.out.println(r);
    System.out.println("------------------------------------");

    System.out.println("Esta estropeado?: (S/N) ");
    tec.nextLine();
    String e = tec.nextLine();
    r.setEstropeado(e.toUpperCase().equals("S"));

    System.out.println(r);
  }
}
