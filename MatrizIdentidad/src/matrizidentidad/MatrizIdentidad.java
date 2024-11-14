/*
  Crear y posteriormente imprimir, una matriz identidad del orden
  especificado por el usuario (pedirlo por teclado).
  Una matriz identidad es aquella en que todas las casillas son 0
  salvo las de la diagonal principal que son 1.
 */
package matrizidentidad;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class MatrizIdentidad {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int num = tec.nextInt();

    int[][] tablero = new int[num][num];

    for (int fila = 0; fila < num; fila++) {
      for (int col = 0; col < num; col++) {
        tablero[fila][col] = (fila == col) ? 1 : 0;
        System.out.print(tablero[fila][col] + "  ");
      }
      System.out.println();
    }
  }
}
