/*

 */
package arrays1;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class Arrays1 {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    int a = 15;
    int b = a;
    a = 17;
    System.out.println(a);
    System.out.println(b);

    int[] x = {10, 12};
    int[] z = x;
    x[1] = 20;
    System.out.println(x[1]);
    System.out.println(z[1]);
  }
}
