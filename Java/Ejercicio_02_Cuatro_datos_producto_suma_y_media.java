// Ejercicio 02 Cuatro datos producto suma y media
import java.util.Scanner;
public class Ejercicio_02_Cuatro_datos_producto_suma_y_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los valores necesarios
        System.out.print("Ingrese dato 1: ");
        int dato1 = sc.nextInt();

        System.out.print("Ingrese dato 2: ");
        int dato2 = sc.nextInt();

        System.out.print("Ingrese dato 3: ");
        int dato3 = sc.nextInt();

        System.out.print("Ingrese dato 4: ");
        int dato4 = sc.nextInt();

        // Obtener suma, producto y media
        int suma = dato1 + dato2 + dato3 + dato4;
        int producto = dato1 * dato2 * dato3 * dato4;
        double mediaAritmetica = suma / 4.0;

        // Presentar los resultados calculados
        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);
        System.out.println("La media aritmética es: " + mediaAritmetica);

        sc.close();
    }
}
