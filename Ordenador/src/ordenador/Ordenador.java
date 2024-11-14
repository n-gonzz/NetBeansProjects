package ordenador;

/**
 *
 * @author alumno
 */
public class Ordenador {

  // Atributos
  String cpu;
  private String gpu;
  private int almacenamiento;
  int memoria;
  private String refrigeracion;
  private boolean encendido;
  double precio;

  public Ordenador(String cpu, double precio, int almacenamiento, int memoria) {
    this.cpu = cpu;
    this.almacenamiento = almacenamiento;
    this.memoria = memoria;
    this.precio = precio;
  }

  void apagar() {
    encendido = false;
  }

  void encender() {
    encendido = true;
  }

  void aumentarMemoria(int memoria) {
    this.memoria += memoria;
  }

  boolean disminuirMemoria(int mem) {
    if (mem <= memoria) {
      memoria -= mem;
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return "CPU: " + cpu
            + "\nGPU: " + gpu
            + "\nRAM: " + memoria + " GB"
            + "\nEstado: " + (encendido ? "Encendido" : "Apagado")
            + "\nRefrigeracion: " + refrigeracion
            + "\nPrecio: " + getPrecio() + "€";
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getMemoria() {
    return memoria;
  }

  public void setMemoria(int memoria) {
    this.memoria = memoria;
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public String getGpu() {
    return gpu;
  }

  public void setGpu(String gpu) {
    this.gpu = gpu;
  }

  public int getAlmacenamiento() {
    return almacenamiento;
  }

  public void setAlmacenamiento(int almacenamiento) {
    this.almacenamiento = almacenamiento;
  }

  public String getRefrigeracion() {
    return refrigeracion;
  }

  public void setRefrigeracion(String refrigeracion) {
    this.refrigeracion = refrigeracion;
  }

  public boolean isEncendido() {
    return encendido;
  }

  public void setEncendido(boolean encendido) {
    this.encendido = encendido;
  }
}
