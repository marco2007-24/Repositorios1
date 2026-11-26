// Ejercicio 27 Tarifa de estacionamiento nocturno

import java.util.Scanner;
public class Ejercicio_27_Tarifa_de_estacionamiento_nocturno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los valores necesarios
        System.out.print("Ingrese las horas de estacionamiento: ");
        double horas = sc.nextDouble();

        System.out.print("¿Es horario nocturno? (S/N): ");
        String nocturno = sc.next().toUpperCase();

        // Comprobar horas
        if (horas > 0) {
            // Obtener tarifa base
            double tarifa = horas * 1.50;

            // Incorporar recargo por tiempo
            if (horas > 8) {
                tarifa = tarifa * 1.25;
            }

            // Incorporar recargo nocturno
            if (nocturno.equals("S")) {
                tarifa = tarifa * 1.30;
            }

            // Presentar el resultado calculado
            double total = tarifa;
            System.out.printf("Total a pagar: $%.2f%n", total);
        } else {
            System.out.println("Las horas deben ser mayores que cero");
        }

        sc.close();
    }
}
