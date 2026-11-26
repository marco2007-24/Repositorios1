// Ejercicio 38 Registro Ventas Diarias

import java.util.Scanner;
public class Ejercicio_38_Registro_Ventas_Diarias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asignar los valores iniciales
        double total = 0;
        int dias = 0;
        int diasSuperiores = 0;
        double mayorVenta = 0;
        int diaMayor = 0;

        // Solicitar primera venta
        System.out.println("Ingrese la venta del día (-1 para terminar):");
        double venta = sc.nextDouble();

        // Registrar ventas
        while (venta != -1) {

            if (venta >= 0) {
                dias = dias + 1;

                // Acumular ventas
                total = total + venta;

                // Contar ventas superiores a $500
                if (venta > 500) {
                    diasSuperiores = diasSuperiores + 1;
                }

                // Identificar venta máxima
                if (dias == 1 || venta > mayorVenta) {
                    mayorVenta = venta;
                    diaMayor = dias;
                }

                // Solicitar siguiente venta
                System.out.println("Ingrese la siguiente venta (-1 para terminar):");
                venta = sc.nextDouble();
            } else {
                System.out.println("La venta no puede ser negativa");
                System.out.println("Ingrese nuevamente (-1 para terminar):");
                venta = sc.nextDouble();
            }
        }

        // Obtener promedio y mostrar resultados
        if (dias > 0) {
            double promedio = total / dias;

            System.out.println("Total de ventas: $" + total);
            System.out.println("Promedio de ventas: $" + promedio);
            System.out.println("Días con ventas superiores a $500: " + diasSuperiores);
            System.out.println("Mayor venta: $" + mayorVenta);
            System.out.println("Día de la mayor venta: " + diaMayor);
        } else {
            System.out.println("No se registraron ventas");
        }

    }
}
