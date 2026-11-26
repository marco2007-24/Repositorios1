// Ejercicio 20 Promedio de N notas
import java.util.Scanner;
public class Ejercicio_20_Promedio_de_N_notas {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir los datos utilizados
        int N, i;
        double nota, suma, promedio;
        // Asignar los valores iniciales
        suma = 0;
        i = 1;
        // Solicitar cantidad de notas
        System.out.println("Ingrese la cantidad de notas:");
        N = sc.nextInt();
        // Comprobar que la cantidad sea mayor que cero
        if (N > 0) {
            // Continuar mientras i sea menor o igual a N
            while (i <= N) {
                // Solicitar la nota
                System.out.println("Ingrese la nota " + i + ":");
                nota = sc.nextDouble();
                // Acumular las notas
                suma = suma + nota;
                // Incrementar el contador
                i = i + 1;
            }
            // Obtener el promedio
            promedio = suma / N;
            // Presentar los resultados obtenidos
            System.out.println("La suma de las notas es: " + suma);
            System.out.println("El promedio es: " + promedio);
        } else {
            // Presentar mensaje de error
            System.out.println("La cantidad de notas debe ser mayor que cero");
        }
    }
}
