// Ejercicio 29 Descuento por volumen y cliente frecuente
import java.util.Scanner;

public class Ejercicio_29_Descuento_por_volumen_y_cliente_frecuente {
    public static void main(String[] args) {

        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);

        // Leer los valores necesarios
        System.out.println("Ingrese el monto de la compra:");
        double monto = sc.nextDouble();

        System.out.println("¿Es cliente frecuente? (S/N):");
        String frecuente = sc.next().toUpperCase();

        // Comprobar monto
        if (monto >= 0) {
            double descuento = 0;

            // Identificar descuento por compra
            if (monto >= 500) {
                descuento = 15;
            } else if (monto >= 300) {
                descuento = 10;
            } else if (monto >= 100) {
                descuento = 5;
            }

            // Incorporar descuento adicional
            if (frecuente.equals("S")) {
                descuento = descuento + 5;
            }

            // Obtener total a pagar
            double total = monto - (monto * descuento / 100);

            // Presentar los resultados calculados
            System.out.println("Descuento aplicado: " + descuento + "%");
            System.out.println("Total a pagar: $" + total);

        } else {
            System.out.println("El monto no puede ser negativo");
        }

        // Cerrar Scanner
        sc.close();
    }
}