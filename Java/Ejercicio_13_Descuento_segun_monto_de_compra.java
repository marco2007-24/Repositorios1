// Ejercicio 13 Descuento segun monto de compra
import java.util.Scanner;

public class Ejercicio_13_Descuento_segun_monto_de_compra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar monto de compra
        System.out.print("Ingrese el monto de la compra: ");
        double compra = sc.nextDouble();

        // Identificar porcentaje de descuento
        double descuento;

        if (compra >= 200) {
            descuento = 0.15;
        } else if (compra >= 100) {
            descuento = 0.10;
        } else {
            descuento = 0.05;
        }

        // Obtener total a pagar
        double total = compra - (compra * descuento);

        // Presentar los resultados calculados
        System.out.println("El descuento es: " + descuento * 100 + "%");
        System.out.println("El total a pagar es: $" + total);

    }
}
