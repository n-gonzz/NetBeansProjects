/*

 */
package cocheprograma;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class CochePrograma {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    Coche coche = new Coche(5);
    coche.matricula = "GTX 1450";
    coche.cilindrada = 1000;
    coche.precio = 25000;

//    System.out.println(coche.nPuertas);
//
//    System.out.println("" + (coche.encendido ? "Encendido" : "Apagado"));
//    coche.encender();
//    System.out.println("" + (coche.encendido ? "Encendido" : "Apagado"));
    coche.abrirPuerta(1);

//    for (int i = 0; i < coche.nPuertas; i++) {
//      System.out.println("Puerta " + i + (coche.puertas[i] ? " Abierto" : " Cerrado"));
//    }
//    System.out.println(coche.matricula);
    coche.imprimirEstado();

  }
}
