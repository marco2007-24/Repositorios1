// Ejercicio 49 Factorial
import java.util.Scanner;
public class Ejercicio_49_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar número
        System.out.println("Ingrese un número:");
        int n = sc.nextInt();

        // Comprobar número
        if (n >= 0 && n <= 20) {
            // Preparar factorial
            long factorial = 1;

            // Obtener factorial
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }

            // Presentar el resultado calculado
            System.out.println("Factorial de " + n + ": " + factorial);
        } else {
            System.out.println("Ingrese un número entre 0 y 20");
        }

        sc.close();
    }
}
