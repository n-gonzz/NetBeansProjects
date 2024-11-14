/*
 * Ordenador Sobremesa
 */
package ordenador;

/**
 *
 * @author alumno
 */
public class Sobremesa extends Ordenador {

  private Teclado teclado;
  private Raton raton;

  public Sobremesa(Teclado teclado, Raton raton, String cpu, double precio, int almacenamiento, int memoria) {
    super(cpu, precio, almacenamiento, memoria);
    this.teclado = teclado;
    this.raton = raton;
  }

  @Override
  public String toString() {
    return "\n- ORDENADOR: "
            + "\n" + teclado
            + "\nRaton: " + raton
            + "\nCPU: " + cpu
            + "\nRAM: " + memoria + " GB"
            + "\nPrecio: " + precio + "€"
            + "\n--------------";
  }

  /**
   * @return the teclado
   */
  public Teclado getTeclado() {
    return teclado;
  }

  /**
   * @param teclado the teclado to set
   */
  public void setTeclado(Teclado teclado) {
    this.teclado = teclado;
  }

  /**
   * @return the raton
   */
  public Raton getRaton() {
    return raton;
  }

  /**
   * @param raton the raton to set
   */
  public void setRaton(Raton raton) {
    this.raton = raton;
  }

}
