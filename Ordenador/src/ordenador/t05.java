/*
  Crear una clase para representar un ordenador.
  Desde el main asignar valores a sus campos y utilizar sus métodos.
 */
package ordenador;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class t05 {

  static void cambiar(int a) {
    a += 50;
    System.out.println(a);
  }
//
//  public static void main(String[] args) {
//    if (args.length != 4) {
//      System.out.println("Se necesita procesador precio y memoria");
//      return;
//    }
//
//    Ordenador o = new Ordenador(args[0],
//            Double.parseDouble(args[1]),
//            Integer.parseInt(args[2]),
//            Integer.parseInt(args[3]));

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
//    Ordenador Ordenador = new Ordenador("i5 10600KF", 1200, 500, 8);

    System.out.print("Introduce el numero de teclas: ");
    int nteclas = tec.nextInt();
    tec.nextLine();

    System.out.print("Introduce la distribucion: ");
    String distr = tec.nextLine();

    System.out.print("Introduce el numero de botones del raton: ");
    int nbotones = tec.nextInt();
    tec.nextLine();

    System.out.print("Introduce la marca del raton: ");
    String marcas = tec.nextLine();

    Raton Raton = new Raton(nbotones, marcas, false);

    System.out.print("Es un raton gaming [S/N]?: ");
    String r = tec.nextLine().toUpperCase();
    Raton.setGaming(r.equals("S"));

    System.out.print("Introduce el procesador: ");
    String procesador = tec.nextLine();

    System.out.print("Introduce la memoria RAM: ");
    int ram = tec.nextInt();

    System.out.print("Introduce la memoria de almacenamiento: ");
    int capacidad = tec.nextInt();

    System.out.print("Introduce la capacidad de la bateria: ");
    int bateria = tec.nextInt();

    System.out.print("Introduce el precio: ");
    double precios = tec.nextDouble();

    Teclado Teclado = new Teclado(nteclas, distr);

    Sobremesa Sobremesa = new Sobremesa(Teclado, Raton, procesador, precios, capacidad, ram);

    Portatil Portatil = new Portatil(bateria, procesador, precios, capacidad, ram);

//    Ordenador.encender();
//    Ordenador.aumentarMemoria(80);
//
//    if (Ordenador.disminuirMemoria(56)) {
//      System.out.println("OK");
//    } else {
//      System.out.println("Error");
//    }
    System.out.println(Sobremesa);
    System.out.println(Portatil);
  }
}
