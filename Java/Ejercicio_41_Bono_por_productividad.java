// Ejercicio 41 Bono por productividad
import java.util.Scanner;
public class Ejercicio_41_Bono_por_productividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los valores necesarios
        System.out.println("Ingrese el sueldo base:");
        double sueldo = sc.nextDouble();

        System.out.println("Ingrese el porcentaje de productividad:");
        double productividad = sc.nextDouble();

        // Identificar porcentaje de bono
        double porcentaje;

        if (productividad >= 90) {
            porcentaje = 0.20;
        } else if (productividad >= 70) {
            porcentaje = 0.10;
        } else if (productividad >= 50) {
            porcentaje = 0.05;
        } else {
            porcentaje = 0;
        }

        // Obtener bono y sueldo total
        double bono = sueldo * porcentaje;
        double total = sueldo + bono;

        // Presentar los resultados calculados
        System.out.println("Bono recibido: $" + bono);
        System.out.println("Total a pagar: $" + total);

    }
}
