/*
Partiendo del ejercicio t05_05:

Nuevas clases: BicicletaCarretera y BTT que hereden de Bicicleta.

BicicletaCarretera añade el atributo dropManillar

BTT añade los atributos recorridoSuspensionDelantera, recorridoSuspensionTrasera

El método de Bicicleta, comprobarEstadoCadena, dejará de imprimir y en su lugar
devolverá un String

En BicicletaCarretera se debe hacer un override de este último método, de modo
que el primer aviso sea a los 5000km y el segundo a los 7000km

Crear constructores en todas las clases.
 */
package bicicleta;

/**
 *
 * @author Nicolás González Dobarro
 */
import java.util.*;

public class t05_05_Bicicleta {

  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    System.out.print("Introduce la presión de la rueda delantera: ");
    int presionDelantera = tec.nextInt();

    System.out.print("Introduce la presión de la rueda trasera: ");
    int presionTrasera = tec.nextInt();

    Random random = new Random();
    int color = random.nextInt(10) + 1;
    tec.nextLine();

    System.out.print("Introduce el tipo de bicicleta: ");
    String tipo = tec.nextLine();

    System.out.print("Introduce los KMs de la cadena: ");
    int kmsCadena = tec.nextInt();

    Bicicleta bicicleta = new Bicicleta(presionDelantera, presionTrasera, color,
            tipo, kmsCadena);

    System.out.println(bicicleta);
    bicicleta.comprobarEstadoCadena();
  }
}
