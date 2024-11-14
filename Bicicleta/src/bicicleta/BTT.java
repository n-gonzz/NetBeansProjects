/*
  BTT
 */
package bicicleta;

/**
 *
 * @author alumno
 */
public class BTT extends Bicicleta {

  public BTT(int presionDelantera, int presionTrasera, int color, String tipo, int kmsCadena) {
    super(presionDelantera, presionTrasera, color, tipo, kmsCadena);
  }

  int recorridoSuspensionDelantera;
  int recorridoSuspensionTrasera;

}
