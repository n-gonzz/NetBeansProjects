/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenador;

/**
 *
 * @author alumno
 */
public class Teclado {

  public int numeroTeclas;
  private String distribucion;

  public Teclado(int numeroTeclas, String distribucion) {
    this.numeroTeclas = numeroTeclas;
    this.distribucion = distribucion;
  }

  /**
   * @return the numeroTeclas
   */
  public int getNumeroTeclas() {
    return numeroTeclas;
  }

  /**
   * @param numeroTeclas the numeroTeclas to set
   */
  public void setNumeroTeclas(int numeroTeclas) {
    this.numeroTeclas = numeroTeclas;
  }

  /**
   * @return the distribucion
   */
  public String getDistribucion() {
    return distribucion;
  }

  /**
   * @param distribucion the distribucion to set
   */
  public void setDistribucion(String distribucion) {
    this.distribucion = distribucion;
  }

  @Override
  public String toString() {
    return "Teclado: " + "\nTeclas: " + numeroTeclas + "\nDistribucion: " + distribucion + "\n--------------";
  }
}
