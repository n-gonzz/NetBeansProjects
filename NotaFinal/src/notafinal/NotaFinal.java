/*
    Pedir por teclado las notas de tres evaluaciones de un módulo y alumno concreto
    (pedimos el nombre de ambos por teclado). Imprimir la nota final obtenida
    (media de las tres evaluaciones) como cadena de caracteres
    ("insuficiente", "suficiente", "bien", "notable" o "sobresaliente")
 */
package notafinal;

import java.util.Scanner;

/**
 *
 * @author Nicolás González Dobarro
 */
public class NotaFinal {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno:");
        String alumno = tec.nextLine();

        System.out.println("Introduce el nombre del modulo:");
        String modulo = tec.nextLine();

        System.out.println("Introduce la nota de la 1º Evaluacion:");
        int nota1 = tec.nextInt();
        System.out.println("Introduce la nota de la 1º Evaluacion:");
        int nota2 = tec.nextInt();
        System.out.println("Introduce la nota de la 1º Evaluacion:");
        int nota3 = tec.nextInt();

        int nota4 = nota1 + nota2 + nota3 / 3;
        String calificacion;

        if (nota4 < 5) {
            calificacion = "Suspenso";
        } else if (nota4 < 6) {
            calificacion = "Suficiente";
        } else if (nota4 < 7) {
            calificacion = "Bien";
        } else if (nota4 < 9) {
            calificacion = "Notable";
        } else {
            calificacion = "Sobresaliente";
        }
        System.out.println(alumno + " tiene como nota final " + calificacion + ", en el módulo " + modulo);
    }
}
