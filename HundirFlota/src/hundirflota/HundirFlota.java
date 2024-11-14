/*
  Programa que cree una matriz de 3x4 enteros representando el tablero de hundir la flota.
  Un 0 significa casilla vacía y un 1 significa barco.

  Jugador 1: Le pedimos que introduzca la fila y columna donde colocar un barco de 1 casilla.
  Si las coordenadas no son correctas debe volverla a introducir.

  Jugador 2: Tiene que hundir el barco. Le pedimos fila y columna, y el programa imprimirá:

     agua     si escogió una casilla vacía

     error    si escogía una posición no válida

     hundido  si encontró el barco

  mientras que el jugador 2 no hunda el barco, le seguiremos pidiendo nuevas coordenadas.
 */
package hundirflota;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class HundirFlota {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    int[][] tablero = new int[3][4];

    for (int[] fila : tablero) {
      for (int col : fila) {
        System.out.print(col + "\t");
      }
      System.out.println("");
    }

    while (true) {
      System.out.println("Jugador 1: Introduce la fila [1-3]: ");
      int f1 = tec.nextInt() - 1;
      System.out.println("Jugador 1: Introduce la columna [1-4]: ");
      int c1 = tec.nextInt() - 1;

      if (f1 >= 0 && f1 < 3 && c1 >= 0 && c1 < 4 && tablero[f1][c1] == 0) {
        tablero[f1][c1] = 1;
        break;
      } else {
        System.out.println("Error");
      }
    }

    while (true) {
      System.out.println("Jugador 2: Introduce la fila [1-3]: ");
      int f2 = tec.nextInt() - 1;
      System.out.println("Jugador 2: Introduce la columna [1-4]: ");
      int c2 = tec.nextInt() - 1;

      if (f2 < 0 || f2 >= 3 || c2 < 0 || c2 >= 4) {
        System.out.println("Error");
      } else if (tablero[f2][c2] == 0) {
        System.out.println("Agua");
      } else if (tablero[f2][c2] == 1) {
        System.out.println("Hundido");
        break;
      }
    }
  }
}
