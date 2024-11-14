package cocheprograma;

public class Coche {

  // Atributos
  String matricula;
  int nPuertas;
  double precio;
  int cilindrada;
  boolean[] puertas;
  boolean encendido;

  public Coche(int nPuertas) {
    this.nPuertas = nPuertas;
    puertas = new boolean[nPuertas];
  }

  String apagar() {
    encendido = false;
    return "Apagado";
  }

  void encender() {
    encendido = true;
  }

  /**
   * Abre una puerta del coche en caso de existir. El numero de puerta comienza
   * en 0
   *
   */
  void abrirPuerta(int puerta) {
    puertas[puerta] = true;

    if (nPuertas <= 0 || nPuertas > 5) {
      System.out.println("Error");
    }
  }

  /**
   * Cierra una puerta del coche en caso de existir. El numero de puerta
   * comienza en 0
   */
  void cerrarPuerta(int puerta) {
    puertas[puerta] = false;
  }

  /**
   * Imprime el estado del coche
   */
  void imprimirEstado() {
    System.out.println("Matricula: " + matricula + "\n" + "Motor: " + (encendido ? "Encendido" : "Apagado") + "\n" + "Precio: " + precio + "\n"
            + "Puertas: " + nPuertas);
    for (boolean puerta : puertas) {
      System.out.print(puerta ? "Abierto " : "Cerrado ");
    }
    System.out.println("");
  }
}
