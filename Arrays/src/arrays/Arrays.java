/*

 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Arrays {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

//    int[] nota = {5, 10, 7, 4, 6, 3, 2};
    int[] nota = new int[7];
    nota[0] = 5;
    nota[1] = 10;
    nota[2] = 7;
    nota[3] = 4;
    nota[4] = 6;
    nota[5] = 3;
    nota[6] = 2;

    for (int i = 0; i < 7; i++) {
      System.out.println(nota[i]);
    }

    int media = 0;
    for (int i = 0; i < 7; i++) {
      media += nota[i];
    }

    media /= 7;
    System.out.println("---------------");
    System.out.println("La media es " + media);
  }
}
