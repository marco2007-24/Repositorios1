// Ejercicio 06 Precio final con descuento e IVA
import java.util.Scanner;
public class Ejercicio_06_Precio_final_con_descuento_e_IVA {
    public static void main(String[] args) {
        // Preparar la lectura desde teclado
        Scanner sc = new Scanner(System.in);
        // Definir variables decimales
        double precioArticulo, precioFinal;
        double precioConDescuento, valorDescuento, valorIVA;
        double IVA, Descuento;
        // Solicitar el precio del articulo
        System.out.println("Ingrese precio del articulo:");
        precioArticulo = sc.nextDouble();
        // Definir porcentaje de descuento e IVA
        Descuento = 0.20;
        IVA = 0.15;
        // Obtener el valor del descuento
        valorDescuento = precioArticulo * Descuento;
        // Obtener el precio con descuento
        precioConDescuento = precioArticulo - valorDescuento;
        // Obtener el IVA sobre el precio con descuento
        valorIVA = precioConDescuento * IVA;
        // Obtener el precio final incluyendo IVA
        precioFinal = precioConDescuento + valorIVA;
        // Presentar los resultados obtenidos
        System.out.println("El precio con descuento es: " + precioConDescuento);
        System.out.println("El precio final es: " + precioFinal);
    }
}
