/*

 */
package arrays2;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Arrays2 {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    int[] x = {10, 20, 30};
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");
    }
    System.out.println("");

    for (int dato : x) {
      System.out.print(dato + " ");
    }
    System.out.println("");

    System.out.println("");
//    System.out.println(Arrays.toString(x));

    int[][] a = {{10, 5, 8}, {7, 4, 3}, {-1, 2, 5}};
//
//    a = new int[3][3];
//    a[0][0] = 10;
//    a[0][1] = 5;
//    a[0][2] = 8;
//
//    a[1][0] = 7;
//    a[1][1] = 4;
//    a[1][2] = 3;
//
//    a[2][0] = -1;
//    a[2][1] = 2;
//    a[2][2] = 5;
    System.out.println(a);

//    for (int fila = 0; fila < a.length; fila++) {
//      for (int col = 0; col < a[fila].length; col++) {
//        System.out.print(a[fila][col] + "\t");
//      }
    for (int[] fila : a) {
      for (int col : fila) {
        System.out.print(col + "\t");
      }

      System.out.println("");
    }

//    System.out.println(Arrays.deepToString(a));
  }
}
