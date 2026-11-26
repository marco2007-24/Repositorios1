// Ejercicio 56 Descuento Comercio
import java.util.Scanner;
public class Ejercicio_56_Descuento_Comercio {
    public static void main(String[] args) {
        
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Solicitar los valores de entrada
        System.out.print("Categoría (1-4): ");
        int categoria = sc.nextInt();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();
        // Comprobar los valores introducidos
        if (categoria < 1 || categoria > 4 || cantidad <= 0 || precio < 0) {
            System.out.println("Datos inválidos");
        } else {
            // Preparar descuento
            double descuento = 0;
            // Descuento según categoría y cantidad
            switch (categoria) {
                case 1:
                    if (cantidad >= 10) {
                        descuento = 0.05;
                    }
                    break;
                case 2:
                    if (cantidad >= 5) {
                        descuento = 0.10;
                    }
                    break;
                case 3:
                    descuento = 0.03;
                    break;
                case 4:
                    descuento = 0;
                    break;
            }
            // Obtener total con descuento
            double total = precio * cantidad * (1 - descuento);
            // Incorporar descuento adicional del 2 %
            if (total > 100) {
                total = total * 0.98;
            }
            // Presentar el resultado calculado
            System.out.println("Total a pagar: $" + total);
        }

    }
}
