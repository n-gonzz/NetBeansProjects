/*
    Pedir por teclado la nota de una evaluación de una módulo
    y alumno concreto (pedimos el nombre de ambos por teclado).
    Imprimir la nota  como cadena de caracteres ("insuficiente",
    "suficiente", "bien", "notable" o "sobresaliente")
 */
package calificacionmodulo;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class CalificacionModulo {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno:");
        String alumno = tec.nextLine();

        System.out.println("Introduce el nombre del modulo:");
        String modulo = tec.nextLine();

        System.out.println("Introduce la nota:");
        int nota = tec.nextInt();
        String calificacion;

        if (nota < 5) {
            calificacion = "Suspenso";
        } else if (nota < 6) {
            calificacion = "Suficiente";
        } else if (nota < 7) {
            calificacion = "Bien";
        } else if (nota < 9) {
            calificacion = "Notable";
        } else {
            calificacion = "Sobresaliente";
        }
        System.out.println(alumno + " tiene como nota " + calificacion + ", en el módulo " + modulo);
    }
}
