/**/
package ordenador;

/**
 *
 * @author alumno
 */
public class Raton {

  private int botones;
  private String marca;
  private boolean gaming;

  public Raton(int botones, String marca, boolean gaming) {
    this.botones = botones;
    this.marca = marca;
    this.gaming = gaming;
  }

  @Override
  public String toString() {
    return "\nBotones: " + botones + "\nMarca: " + marca + "\nGaming: " + (gaming ? "SI" : "NO") + "\n--------------";
  }

  /**
   * @return the botones
   */
  public int getBotones() {
    return botones;
  }

  /**
   * @param botones the botones to set
   */
  public void setBotones(int botones) {
    this.botones = botones;
  }

  /**
   * @return the marca
   */
  public String getMarca() {
    return marca;
  }

  /**
   * @param marca the marca to set
   */
  public void setMarca(String marca) {
    this.marca = marca;
  }

  /**
   * @return the gaming
   */
  public boolean isGaming() {
    return gaming;
  }

  /**
   * @param gaming the gaming to set
   */
  public void setGaming(boolean gaming) {
    this.gaming = gaming;
  }
}
