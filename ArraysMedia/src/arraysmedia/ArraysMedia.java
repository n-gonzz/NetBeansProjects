/*

 */
package arraysmedia;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class ArraysMedia {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    System.out.println("Introduce el nombre del alumno:");
    String alumno = tec.nextLine();

    System.out.println("Introduce el nombre del modulo:");
    String modulo = tec.nextLine();

    int[] nota = new int[3];
    int media = 0;
    for (int i = 0; i < nota.length; i++) {
      System.out.println("Introduce la nota de la 1, 2 y 3º Evaluacion:" + (i + i));
      nota[i] = tec.nextInt();
      media += nota[i];
    }

    media /= nota.length;

    String calificacion;
    if (media < 5) {
      calificacion = "Suspenso";
    } else if (media < 6) {
      calificacion = "Suficiente";
    } else if (media < 7) {
      calificacion = "Bien";
    } else if (media < 9) {
      calificacion = "Notable";
    } else {
      calificacion = "Sobresaliente";
    }
    System.out.println(alumno + " tiene como nota final " + calificacion + ", en el módulo " + modulo);
  }
}
