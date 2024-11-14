/*
  Utilizando un array para almacenar los datos, pedir un número indicando la hora
  (primeara, segunda, tercera, ....)e indicar que módulo se esta impartiendo a esa
  hora (no contamos el recreo).
 */
package horariolunes;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class HorarioLunes {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    String p = "Programacion";
    String ip = "Itinerario Personal";
    String st = "Sustentabilidade";
    String lm = "Linguaxes de Marcas";

    String[] modulo = {p, p, p, ip, st, lm, lm};

    System.out.print("Introduce la hora: ");
    while (true) {
      int materia = tec.nextInt();

      if (materia > 1 || materia < modulo.length) {
        System.out.println("A esa hora hay: " + modulo[materia - 1]);
        break;
      }
    }
  }
}
