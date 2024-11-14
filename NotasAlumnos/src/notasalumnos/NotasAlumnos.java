/*
  Crear un array de dos dimensiones para almacenar
  las notas de los 3 parciales de todos los alumnos
  del módulo de programación.

  Pedir todas las notas por teclado.

  Imprimir la matriz resultante.

  Pedir por teclado un número de alumno (comprobar su validez)
  e imprimir su nota final (media de los parciales)
 */
package notasalumnos;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class NotasAlumnos {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    System.out.println("Introduce el numero del alumno:");
    int alumno = tec.nextInt();

    System.out.println("Introduce la nota de la 1º Evaluacion:");
    int nota1 = tec.nextInt();
    System.out.println("Introduce la nota de la 1º Evaluacion:");
    int nota2 = tec.nextInt();
    System.out.println("Introduce la nota de la 1º Evaluacion:");
    int nota3 = tec.nextInt();

    int[][] tablero = new int[3][4];

    for (int[] fila : tablero) {
      for (int col : fila) {
        System.out.print(col + "\t");
      }
      System.out.println("");

    }
  }
}
