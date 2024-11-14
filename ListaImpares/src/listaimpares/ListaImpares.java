/*
Imprimir los números impares en el intervalo [1-50] al revés.
 */
package listaimpares;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class ListaImpares {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    int num = 49;

    while (num > 0) {
      System.out.println(num);
      num -= 2;
    }
  }
}
