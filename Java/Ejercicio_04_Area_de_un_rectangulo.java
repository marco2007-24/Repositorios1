// Ejercicio 04 Area de un rectangulo
import java.util.Scanner;

public class Ejercicio_04_Area_de_un_rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer los valores necesarios
        System.out.print("Ingrese base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese altura del rectángulo: ");
        double altura = sc.nextDouble();

        // Obtener área
        double area = base * altura;

        // Presentar el resultado calculado
        System.out.println("El área es: " + area);

    }
}
