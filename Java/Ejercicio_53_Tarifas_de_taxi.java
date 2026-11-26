// Ejercicio 53 Tarifas de taxi
import java.util.Scanner;
public class Ejercicio_53_Tarifas_de_taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los valores necesarios
        System.out.println("Ingrese los kilómetros recorridos:");
        double km = sc.nextDouble();

        System.out.println("¿Es de noche? (S/N):");
        String noche = sc.next().toUpperCase();

        // Comprobar distancia
        if (km >= 0) {
            // Obtener tarifa base
            double tarifa = 2 + (1.50 * km);

            // Incorporar recargo por distancia
            if (km > 10) {
                tarifa = tarifa * 1.20;
            }

            // Incorporar recargo nocturno
            if (noche.equals("S")) {
                tarifa = tarifa * 1.30;
            }

            // Presentar el resultado calculado
            System.out.println("Total a pagar: $" + tarifa);
        } else {
            System.out.println("Los kilómetros no pueden ser negativos");
        }

    }
}
