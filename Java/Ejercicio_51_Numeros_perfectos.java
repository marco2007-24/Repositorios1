// Ejercicio 51 Numeros perfectos
import java.util.Scanner;
public class Ejercicio_51_Numeros_perfectos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar número
        System.out.println("Ingrese un número entero positivo:");
        int N = sc.nextInt();

        // Comprobar número
        if (N > 0) {
            // Preparar suma
            int suma = 0;

            // Acumular divisores propios
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    suma = suma + i;
                }
            }

            // Comprobar número perfecto
            if (suma == N) {
                System.out.println(N + " es un número perfecto");
            } else {
                System.out.println(N + " no es un número perfecto");
            }
        } else {
            System.out.println("Debe ingresar un número positivo");
        }

    }
}
