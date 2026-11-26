// Ejercicio 42 Clasificacion de triangulo por angulos
import java.util.Scanner;
public class Ejercicio_42_Clasificacion_de_triangulo_por_angulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar ángulos
        System.out.println("Ingrese el primer ángulo:");
        double a1 = sc.nextDouble();

        System.out.println("Ingrese el segundo ángulo:");
        double a2 = sc.nextDouble();

        System.out.println("Ingrese el tercer ángulo:");
        double a3 = sc.nextDouble();

        // Comprobar ángulos
        if (a1 <= 0 || a2 <= 0 || a3 <= 0) {
            System.out.println("Error: los ángulos deben ser positivos");
        } else if (Math.abs(a1 + a2 + a3 - 180) > 0.000001) {
            System.out.println("Los ángulos no forman un triángulo");
        } else {
            // Clasificar triángulo
            if (a1 == 90 || a2 == 90 || a3 == 90) {
                System.out.println("Triángulo rectángulo");
            } else if (a1 > 90 || a2 > 90 || a3 > 90) {
                System.out.println("Triángulo obtusángulo");
            } else {
                System.out.println("Triángulo acutángulo");
            }
        }

        sc.close();
    }
}
