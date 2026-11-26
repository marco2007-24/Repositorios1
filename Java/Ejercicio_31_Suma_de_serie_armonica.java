// Ejercicio 31 Suma de serie armonica
import java.util.Scanner;
public class Ejercicio_31_Suma_de_serie_armonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los valores necesarios
        System.out.println("Ingrese el valor de N:");
        int N = sc.nextInt();

        // Comprobar número
        if (N > 0) {
            // Asignar los valores iniciales
            double suma = 0;
            int i = 1;

            // Obtener suma de la serie
            while (i <= N) {
                suma = suma + (1.0 / i);
                i = i + 1;
            }

            // Presentar el resultado calculado
            System.out.println("La suma de la serie es: " + suma);
        } else {
            System.out.println("N debe ser mayor que cero");
        }

    }
}
