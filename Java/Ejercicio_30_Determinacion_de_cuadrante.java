// Ejercicio 30 Determinacion de cuadrante
import java.util.Scanner;
public class Ejercicio_30_Determinacion_de_cuadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar coordenadas
        System.out.println("Ingrese la coordenada x:");
        double x = sc.nextDouble();

        System.out.println("Ingrese la coordenada y:");
        double y = sc.nextDouble();

        // Identificar posición del punto
        if (x == 0 && y == 0) {
            System.out.println("El punto está en el origen");
        } else if (x == 0) {
            System.out.println("El punto está sobre el eje Y");
        } else if (y == 0) {
            System.out.println("El punto está sobre el eje X");

        // Identificar cuadrante
        } else if (x > 0 && y > 0) {
            System.out.println("Primer cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("Segundo cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("Tercer cuadrante");
        } else {
            System.out.println("Cuarto cuadrante");
        }

    }
}
