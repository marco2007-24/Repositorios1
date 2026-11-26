// Ejercicio 52 Punto medio y distancia entre dos puntos
import java.util.Scanner;
public class Ejercicio_52_Punto_medio_y_distancia_entre_dos_puntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar coordenadas
        System.out.println("Ingrese x1:");
        double x1 = sc.nextDouble();

        System.out.println("Ingrese y1:");
        double y1 = sc.nextDouble();

        System.out.println("Ingrese x2:");
        double x2 = sc.nextDouble();

        System.out.println("Ingrese y2:");
        double y2 = sc.nextDouble();

        // Obtener distancia
        double distancia = Math.sqrt(
            Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        // Obtener punto medio
        double xm = (x1 + x2) / 2;
        double ym = (y1 + y2) / 2;

        // Presentar los resultados calculados
        System.out.println("Distancia entre los puntos: " + distancia);
        System.out.println("Punto medio: (" + xm + ", " + ym + ")");

    }
}
