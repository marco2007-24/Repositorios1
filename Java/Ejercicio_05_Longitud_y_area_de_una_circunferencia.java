// Ejercicio 05 Longitud y area de una circunferencia
import java.util.Scanner;

public class Ejercicio_05_Longitud_y_area_de_una_circunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar radio
        System.out.print("Ingrese radio de la circunferencia: ");
        double radio = sc.nextDouble();

        // Obtener diámetro, longitud y área
        double diametro = 2 * radio;
        double longitud = Math.PI * diametro;
        double area = Math.PI * Math.pow(radio, 2);

        // Presentar los resultados calculados
        System.out.println("La longitud es: " + longitud);
        System.out.println("El área es: " + area);

    }
}
