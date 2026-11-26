// Ejercicio 03 Area de un triangulo
import java.util.Scanner;

public class Ejercicio_03_Area_de_un_triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer los valores necesarios
        System.out.print("Ingrese base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese altura del triángulo: ");
        double altura = sc.nextDouble();

        // Obtener área
        double area = base * altura / 2;

        // Presentar el resultado calculado
        System.out.println("El área es: " + area);

    }
}
