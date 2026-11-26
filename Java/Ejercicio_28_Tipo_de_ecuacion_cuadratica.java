// Ejercicio 28 Tipo de ecuacion cuadratica

import java.util.Scanner;

public class Ejercicio_28_Tipo_de_ecuacion_cuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar coeficientes
        System.out.print("Ingrese el coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el coeficiente c: ");
        double c = sc.nextDouble();

        // Comprobar si es cuadrática
        if (a == 0) {
            System.out.println("No es una ecuación cuadrática");
        } else {
            // Obtener discriminante
            double discriminante = b * b - 4 * a * c;

            // Clasificar las soluciones
            if (discriminante > 0) {
                System.out.println("Tiene dos soluciones reales");
            } else if (discriminante == 0) {
                System.out.println("Tiene una solución real");
            } else {
                System.out.println("No tiene soluciones reales");
            }
        }

    }
}
