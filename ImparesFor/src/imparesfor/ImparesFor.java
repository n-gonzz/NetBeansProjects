/*
    Imprimir los números impares entre 1-10 utilizando un bucle for
 */
package imparesfor;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class ImparesFor {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    for (int i = 1; i < 10; i += 2) {
      System.out.println(i);
    }
  }
}
