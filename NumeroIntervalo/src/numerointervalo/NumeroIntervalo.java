/*
    Pedir un número por teclado en el intervalo [35-97].
    El número debe ser correcto; en otro caso, se debe volver a pedir;
    Imprimir la 7ª potencia de ese número.
 */
package numerointervalo;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class NumeroIntervalo {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    System.out.println("Introduce un numero entre [35-97]:");
    while (true) {
      int num = tec.nextInt();

      if (num >= 35 && num <= 97) {
        double resultado = Math.pow(num, 7);
        System.out.println(resultado);
      } else {
        System.out.println("Introduce un numero valido entre [35-97]:");
      }
    }
  }
}
