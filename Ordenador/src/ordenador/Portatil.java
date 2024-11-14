/*
 * Ordenador Portatil
 */
package ordenador;

/**
 *
 * @author alumno
 */
public class Portatil extends Ordenador {

  @Override
  public String toString() {
    return "\n- PORTATIL: "
            + "\nCPU: " + cpu
            + "\nRAM: " + memoria + " GB"
            + "\nBateria: " + capacidadBateria + " mAh"
            + "\nPrecio: " + precio + "€"
            + "\n--------------";
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public int getMemoria() {
    return memoria;
  }

  public void setMemoria(int memoria) {
    this.memoria = memoria;
  }

  public Portatil(double capacidadBateria, String cpu, double precio, int almacenamiento, int memoria) {
    super(cpu, precio, almacenamiento, memoria);
    this.capacidadBateria = capacidadBateria;
  }

  private double capacidadBateria;

  /**
   * @return the capacidadBateria
   */
  public double getCapacidadBateria() {
    return capacidadBateria;
  }

  /**
   * @param capacidadBateria the capacidadBateria to set
   */
  public void setCapacidadBateria(double capacidadBateria) {
    this.capacidadBateria = capacidadBateria;
  }
}
