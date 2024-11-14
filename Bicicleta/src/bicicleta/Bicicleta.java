/*
  Clase Bicicleta
 */
package bicicleta;

public class Bicicleta {

  private int[] presion = new int[2];
  private int color;
  private String tipo;
  private int kmsCadena;
  private static final String[] COLORES = {"Rojo", "Azul", "Naranja", "Amarillo", "Blanco", "Negro", "Rosa", "Violeta", "Verde", "Marrón"};

  public Bicicleta(int presionDelantera, int presionTrasera, int color, String tipo, int kmsCadena) {
    this.presion[0] = presionDelantera;
    this.presion[1] = presionTrasera;
    this.color = color;
    this.tipo = tipo;
    this.kmsCadena = kmsCadena;
  }

  public int[] getPresion() {
    return presion;
  }

  public void setPresion(int[] presion) {
    this.presion = presion;
  }

  public void setPresion(int rueda, int valor) {
    if (rueda == 1 || rueda == 2) {
      this.presion[rueda - 1] = valor;
    } else {
      System.out.println("Número de rueda no válido. Usa 1 para delantera, 2 para trasera.");
    }
  }

  public int getColor() {
    return color;
  }

  public void setColor(int color) {
    this.color = color;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getKmsCadena() {
    return kmsCadena;
  }

  public void setKmsCadena(int kmsCadena) {
    this.kmsCadena = kmsCadena;
  }

  public void comprobarEstadoCadena() {
    if (kmsCadena <= 1800) {
      System.out.println("La cadena esta en buen estado");
    } else if (kmsCadena > 1800 && kmsCadena <= 2000) {
      System.out.println("La cadena esta demasiado gastada");
    } else {
      System.out.println("SUSTITUIR INMEDIATAMENTE LA CADENA");
    }
  }

  @Override
  public String toString() {
    return "\nEstado de la bicicleta:"
            + "\nPresión de la rueda delantera: " + presion[0] + " bares"
            + "\nPresión de la rueda delantera: " + presion[1] + " bares"
            + "\nColor: " + COLORES[color - 1]
            + "\nTipo: " + tipo
            + "\nKMs de la cadena: " + kmsCadena;
  }

  public String toString2() {
    return "\nEstado de la cadena:"
            + "\nKMs de la cadena: " + kmsCadena;

  }
}
