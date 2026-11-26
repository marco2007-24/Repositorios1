// Ejercicio 50 Maximo comun divisor
import java.util.Scanner;
public class Ejercicio_50_Maximo_comun_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer los valores necesarios
        System.out.println("Ingrese el primer número positivo:");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo número positivo:");
        int b = sc.nextInt();

        // Comprobar números
        if (a > 0 && b > 0) {
            // Obtener MCD
            while (b != 0) {
                int residuo = a % b;
                a = b;
                b = residuo;
            }

            // Presentar el resultado calculado
            System.out.println("El MCD es: " + a);
        } else {
            System.out.println("Los números deben ser positivos");
        }

    }
}
