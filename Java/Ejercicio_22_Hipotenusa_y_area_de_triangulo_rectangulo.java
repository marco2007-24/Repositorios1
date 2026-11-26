// Ejercicio 22 Hipotenusa y area de triangulo rectangulo
import java.util.Scanner;

public class Ejercicio_22_Hipotenusa_y_area_de_triangulo_rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar catetos
        System.out.print("Ingrese cateto a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese cateto b: ");
        double b = sc.nextDouble();

        // Obtener hipotenusa y área
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double area = (a * b) / 2;

        // Presentar los resultados calculados
        System.out.println("La hipotenusa es: " + c);
        System.out.println("El área del triángulo es: " + area);

    }
}