/*
   Rotulador
 */
package pruebafinal;

/**
 *
 * @author alumno
 */
public class Rotulador {

  private String color;
  private double capacidad;
  private double reserva;
  private double precio;
  private boolean estropeado;

  public boolean isEstropeado() {
    return estropeado;
  }

  public void setEstropeado(boolean estropeado) {
    this.estropeado = estropeado;
  }

  public Rotulador(double capacidad) {
    this.capacidad = capacidad;
  }

  public Rotulador(String color, double capacidad, double precio) {
    this.color = color;
    this.capacidad = this.reserva = capacidad;
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Color: " + color
            + "\nCapacidad: " + capacidad + " mL"
            + "\nReserva: " + reserva + " mL"
            + "\nPrecio: " + precio + " €"
            + "\nEstropeado: " + (estropeado ? "SI" : "NO");
  }

//  public void setColor(String color) {
//    this.color = color;
//
//  }
//
//  public String getColor() {
//    return color;
//  }
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getCapacidad() {
    return capacidad;
  }

  public double getReserva() {
    return reserva;
  }

  public void setReserva(double reserva) {
    this.reserva = reserva;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }
}
